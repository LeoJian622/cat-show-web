package xyz.foolcat.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.foolcat.model.UserInfo;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserInfoMapperTest {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Test
    void insert() {
        UserInfo userInfo = new UserInfo().withUnionId("asdfgsdadfaffghdfghgsdfg")
                .withUserIdentity(1)
                .withNickName("test")
                .withPhone("234")
                .withPortraitUrl("http://asdasd.ad.asd/asd/asd")
                .withSex("male")
//                .withCreateTime(new Date())
                .withUpdateTime(new Date());
        userInfoMapper.insertSelective(userInfo);
    }

    @Test
    void selectByUnionId() {
        System.out.println(userInfoMapper.selectByUnionId("asdfgsdadfaffghdfghgsdfg"));
    }
}