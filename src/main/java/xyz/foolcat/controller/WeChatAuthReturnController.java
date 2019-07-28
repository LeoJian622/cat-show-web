package xyz.foolcat.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import xyz.foolcat.config.WeChatAuthenticateConfig;
import xyz.foolcat.dto.WeChatAuthReturnDTO;

import java.net.URI;
import java.util.Map;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-07-2019/7/27 0:30
 */

@RestController
@RequestMapping(value = "/wechat")
public class WeChatAuthReturnController {

    @Autowired
    WeChatAuthenticateConfig weChatAuthenticateConfig;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/auth/{code}")
    public Map authenticate(@PathVariable String code) throws Exception {
        URI url = UriComponentsBuilder.fromUriString(weChatAuthenticateConfig.getApiUrl()
                + "/sns/jscode2session?appid={appid}&secret={secret}&js_code={code}&grant_type=authorization_code")
                .build(weChatAuthenticateConfig.getAppId(), weChatAuthenticateConfig.getAppSecret(), code);

      ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        WeChatAuthReturnDTO weChatAuthReturnDTO = JSON.parseObject(responseEntity.getBody(), WeChatAuthReturnDTO.class);
        return null;
    }
}
