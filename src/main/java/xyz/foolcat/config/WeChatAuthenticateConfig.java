package xyz.foolcat.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyongjian
 * @date  2019-7-23 23:28:37
 * @version 1.0
 */

@ConfigurationProperties(prefix = "wechat")
@Data
public class WeChatAuthenticateConfig {

    private String appId;

    private String appSecret;

    private String apiUrl;
}
