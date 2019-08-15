package xyz.foolcat.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import xyz.foolcat.config.WeChatAuthenticateConfig;
import xyz.foolcat.dto.WeChatAuthDTO;
import xyz.foolcat.dto.WeChatAuthReturnDTO;
import xyz.foolcat.exception.LoginException;
import xyz.foolcat.model.UserInfo;
import xyz.foolcat.service.UserInfoService;
import xyz.foolcat.utils.AesEncryptUtils;
import xyz.foolcat.utils.JwtUtils;

import java.net.URI;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-07-2019/7/27 0:30
 */

@Slf4j
@RestController
@RequestMapping(value = "/wechat")
public class WeChatAuthReturnController {

    private final WeChatAuthenticateConfig weChatAuthenticateConfig;

    private final JwtUtils jwtUtils;

    private final RestTemplate restTemplate;

    private final RedisTemplate redisTemplate;

    private final UserInfoService userInfoService;

    @Autowired
    public WeChatAuthReturnController(WeChatAuthenticateConfig weChatAuthenticateConfig, JwtUtils jwtUtils, RestTemplate restTemplate, RedisTemplate redisTemplate, UserInfoService userInfoService) {
        this.weChatAuthenticateConfig = weChatAuthenticateConfig;
        this.restTemplate = restTemplate;
        this.redisTemplate = redisTemplate;
        this.jwtUtils = jwtUtils;
        this.userInfoService = userInfoService;
    }

    @PostMapping(value = "/authentication", produces = "application/json")
    public String authenticate(@RequestBody WeChatAuthDTO weChatAuthDTO) throws Exception {

        URI url = UriComponentsBuilder.fromUriString(weChatAuthenticateConfig.getApiUrl()
                + "/sns/jscode2session?appid={appid}&secret={secret}&js_code={code}&grant_type=authorization_code")
                .build(weChatAuthenticateConfig.getAppId(), weChatAuthenticateConfig.getAppSecret(), weChatAuthDTO.getCode());

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        WeChatAuthReturnDTO weChatAuthReturnDTO = JSON.parseObject(responseEntity.getBody(), WeChatAuthReturnDTO.class);
        log.debug("code请求返回：{}", responseEntity.getBody());
        int errorCode = weChatAuthReturnDTO.getErrcode();
        if (0 != errorCode) {
            log.error("获取微信SEESION_KEY失败 errcode:{} errmsg:{}", weChatAuthReturnDTO.getErrcode(), weChatAuthReturnDTO.getErrmsg());
            return JSON.toJSONString(weChatAuthReturnDTO);
        } else {

            UserInfo userInfo = userInfoService.getByUnionId(weChatAuthReturnDTO.getOpenId());
            if (null == userInfo) {
                /**
                 * 数据解密
                 */
                byte[] decryptdata = AesEncryptUtils.decrypt(weChatAuthDTO.getEncryptData(), weChatAuthReturnDTO.getSessionKey(), weChatAuthDTO.getIv());
                if (decryptdata == null) {
                    throw new LoginException("获取不到用户信息");
                }
                userInfo = JSON.parseObject(new String(decryptdata), UserInfo.class);
                userInfoService.insert(userInfo);
            }

            redisTemplate.opsForValue().set(DigestUtils.md5Hex(weChatAuthReturnDTO.getOpenId()), weChatAuthReturnDTO);
            log.info("获取微信SEESION_KEY成功");

            //生成token并返回
            String token = jwtUtils.generateToken(userInfo);
            log.debug("token：{}", token);
            return token;
        }
    }

}
