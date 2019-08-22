package xyz.foolcat.config;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liyongjian
 * @version 1.0
 * @date 2019-08-2019/8/18 20:48
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class RedisConfigTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void redisTemplate() {
        redisTemplate.opsForValue().set("asdasd","asdfadsf");
    }
}