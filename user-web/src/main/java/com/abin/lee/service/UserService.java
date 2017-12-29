package com.abin.lee.service;

import com.abin.lee.model.UserInfo;
import com.abin.lee.vo.UserInfoDto;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by abin
 * Be Created in 2016/11/29.
 */

public interface UserService {


    void add(UserInfoDto userInfoDto) throws InvocationTargetException, IllegalAccessException;


    UserInfo find(Integer id);

}
