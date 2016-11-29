package com.abin.lee.service;

import com.abin.lee.dao.UserInfoMapper;
import com.abin.lee.model.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by abin
 * Be Created in 2016/11/29.
 */
@Service
public class UserService {

    @Resource
    UserInfoMapper userInfoMapper;


    public UserInfo find(Integer id){
        return userInfoMapper.selectByPrimaryKey(id);
    }


}
