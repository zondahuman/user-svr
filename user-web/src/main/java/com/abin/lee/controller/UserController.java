package com.abin.lee.controller;

import com.abin.lee.dao.UserInfoMapper;
import com.abin.lee.model.UserInfo;
import com.abin.lee.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by abin
 * Be Created in 2016/11/29.
 */
@Controller
@RequestMapping("/trend")
public class UserController {
    protected final static Logger logger = LoggerFactory.getLogger(UserController.class);



    @Resource
    UserService userService;

    @RequestMapping(value = "/find", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public UserInfo find(@RequestParam(value = "id") Integer id) {
        UserInfo userInfo = null;
        try {
            userInfo = this.userService.find(id);
        } catch (Exception e) {
            logger.error("e={}", e);
        }
        return userInfo;
    }




}
