package com.abin.lee.user.find.test;

import com.abin.lee.vo.UserInfoDto;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Created by abin on 2017/12/29 16:28.
 * user-svr
 * com.abin.lee.user.find.test
 */
public class UserFindTest {

    private RestTemplate restTemplate = new RestTemplate();
//    String url = "http://172.16.2.145:8100/user/find?id={id}";
    String url = "http://localhost:8100/user/find?id={id}";

    @Test
    public void testGetUserInfo() {
        int id = 1;
        UserInfoDto userInfoDto = restTemplate.postForObject(url, null, UserInfoDto.class, id);
        System.out.println(JSON.toJSONString(userInfoDto));
    }

}
