package xyz.foolcat.service;

import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.foolcat.mapper.UserInfoMapper;
import xyz.foolcat.model.UserInfo;

/**
 * 用户接口服务类
 *
 * @author liyongjian
 * @author  2019-08-12 17:08
 */

@Service
public class UserInfoService {

    private final UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoService(UserInfoMapper userInfoMapper){
        this.userInfoMapper = userInfoMapper;
    }

    public UserInfo getByPrimaryKey(String id) throws Exception{
        return userInfoMapper.selectByPrimaryKey(id);
    }

    public UserInfo getByUnionId(String unionId) throws Exception{
        return userInfoMapper.selectByUnionId(unionId);
    }

    public String insert(UserInfo userInfo) throws Exception{
        return userInfoMapper.insertSelective(userInfo) == 1? userInfo.getId():null;
    }

}
