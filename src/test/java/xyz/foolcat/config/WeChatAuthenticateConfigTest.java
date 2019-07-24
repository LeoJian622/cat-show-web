package xyz.foolcat.config;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-07-2019/7/23 23:41
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class WeChatAuthenticateConfigTest {

    @Autowired
    WeChatAuthenticateConfig weChatAuthenticateConfig;

    @Test
    void getAppId() {
        System.out.println(weChatAuthenticateConfig.getAppId());
    }

    @Test
    void getAppSecret() {
        System.out.println(weChatAuthenticateConfig.getAppSecret());
    }
}