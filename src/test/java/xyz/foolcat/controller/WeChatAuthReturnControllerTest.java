package xyz.foolcat.controller;

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
        mockMvc.perform(MockMvcRequestBuilders.get("/wechat/auth/021bCdvb04wBUA13ELvb08L5vb0bCdva").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}