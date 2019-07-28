package xyz.foolcat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import xyz.foolcat.config.WeChatAuthenticateConfig;

/**
 * @author liyongjian
 * @date 2019-7-28 00:51:09
 */
@SpringBootApplication
@MapperScan(value = "xyz.foolcat.mapper")
@EnableConfigurationProperties({WeChatAuthenticateConfig.class})
public class FoolCatSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoolCatSpringApplication.class, args);
	}


}
