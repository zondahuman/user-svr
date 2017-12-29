package com.abin.lee.user.insert.test;

import com.abin.lee.util.HttpClientUtil;
import com.abin.lee.vo.UserInfoDto;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abin on 2017/12/29 16:28.
 * user-svr
 * com.abin.lee.user.find.test
 */
public class UserAddTest {

//    String httpURL = "http://172.16.2.145:8100/user/httpURL";
    String httpURL = "http://localhost:8100/user/add";

    @Test
    public void testUserAdd() {
        try {
            CloseableHttpClient httpClient = HttpClientUtil.getHttpClient();
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("userName", "lee"+ (int)(Math.random()*10) ));
            nvps.add(new BasicNameValuePair("age",(int)(Math.random()*100) +""));
            nvps.add(new BasicNameValuePair("verifyId", "1605250678900100000565"));
            nvps.add(new BasicNameValuePair("mobile", "1389999777"+ (int)(Math.random()*10) ));
            HttpPost httpPost = new HttpPost(httpURL);

            httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
            System.out.println("Executing request: " + httpPost.getRequestLine());
            HttpResponse response = httpClient.execute(httpPost);
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }




}
