package xyz.foolcat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.foolcat.mapper.SysUserInfoMapper;

/**
 * 用户接口服务类
 *
 * @author 李永键
 * @create 2019-08-12 17:08
 */

@Service
@Transactional
public class SysUserInfoService {

    private final SysUserInfoMapper sysUserInfoMapper;

    @Autowired
    public SysUserInfoService(SysUserInfoMapper sysUserInfoMapper){
        this.sysUserInfoMapper = sysUserInfoMapper;
    }

}
