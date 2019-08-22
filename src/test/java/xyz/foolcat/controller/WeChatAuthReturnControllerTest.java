package xyz.foolcat.controller;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import xyz.foolcat.model.UserInfo;
import xyz.foolcat.utils.AesEncryptUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-07-2019/7/28 0:12
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class WeChatAuthReturnControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void authenticate() throws Exception {
        String en = "SNu3ZHj8a61YI+IErsNX+aX7QQWJmhKHI1502T2LG1Jhiq4ppc04VPuuDQSuYgypEREawgxT9jsdIcC1mUZxR1ULdKl23WEKpLV4aIRnGj2V9wnIlU75f0x/1hGqvWCZTWMDwEwyDbMPMgFEKl0SK9FhQOPlXFI4XrPg32xIinJ72tbTvfwV+jPfv6ie7oGbb1zER0Rzqb4jBVt+l65cl+EdbZ4u/bVBTX3t0zOFZT6tbfCFqFUy3kHiGz+++GwaaS5UTUJhdzG2PpMS/dtBaApY5CZyaBP17oVDZHzEDNODPERqj9Fm9DtoCUfUeSzHN9XliaMhJdL0HlbcgeQ7UhmYUbl6BlqkwkkbBWW15WWQCNiXIEBc8zAISEEb0aHkmK36biNMbG7/STk5HPqcnqNhCK34Y6FPz1pnY2QkoWl3IJv4qQrsntEbvvREi9GVsbykkUrfXlmy/jplyMQlHsAm6ZCXMxgS0RWLvdpronE=";
        String iv = "TmonhS1xOkv9HLUdvvRaoQ==";
        String code ="021bfqyP1byj731R9GAP13d6yP1bfqyI";
        Map<String,String> data = new HashMap<>();
        data.put("code",code);
        data.put("encryptedData",en);
        data.put("iv",iv);


        mockMvc.perform(MockMvcRequestBuilders.post("/wechat/authentication")
                .content(JSON.toJSONString(data))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    void pareJson() throws Exception{
        String en = "CiyLU1Aw2KjvrjMdj8YKliAjtP4gsMZMQmRzooG2xrDcvSnxIMXFufNstNGTyaGS9uT5geRa0W4oTOb1WT7fJlAC+oNPdbB+3hVbJSRgv+4lGOETKUQz6OYStslQ142dNCuabNPGBzlooOmB231qMM85d2/fV6ChevvXvQP8Hkue1poOFtnEtpyxVLW1zAo6/1Xx1COxFvrc2d7UL/lmHInNlxuacJXwu0fjpXfz/YqYzBIBzD6WUfTIF9GRHpOn/Hz7saL8xz+W//FRAUid1OksQaQx4CMs8LOddcQhULW4ucetDf96JcR3g0gfRK4PC7E/r7Z6xNrXd2UIeorGj5Ef7b1pJAYB6Y5anaHqZ9J6nKEBvB4DnNLIVWSgARns/8wR2SiRS7MNACwTyrGvt9ts8p12PKFdlqYTopNHR1Vf7XjfhQlVsAJdNiKdYmYVoKlaRv85IfVunYzO0IKXsyl7JCUjCpoG20f0a04COwfneQAGGwd5oa+T8yO5hzuyDb/XcxxmK01EpqOyuxINew==";
        String a = new String(AesEncryptUtils.decrypt(en,"tiihtNczf5v6AKRyjwEUhQ==","r7BXXKkLb8qrSNn05n0qiA=="));

        UserInfo userInfo = JSON.parseObject(a,UserInfo.class);

        System.out.println(userInfo);
    }

}