package com.abin.lee.user.insert.test;

import com.abin.lee.util.HttpClientUtil;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by abin on 2017/12/29 16:28.
 * user-svr
 * com.abin.lee.user.find.test
 */
public class UserAddTest {

//    public static String httpURL = "http://172.16.2.145:7000/user/add";
    public static String httpURL = "http://localhost:8100/user/add";

    @Test
    public void testUserAdd() {
        try {
            CloseableHttpClient httpClient = HttpClientUtil.getHttpClient();
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("userName", "lee" + (int) (Math.random() * 10)));
            nvps.add(new BasicNameValuePair("age", (int) (Math.random() * 100) + ""));
            nvps.add(new BasicNameValuePair("verifyId", "1605250678900100000565"));
            nvps.add(new BasicNameValuePair("mobile", "1389999777" + (int) (Math.random() * 10)));
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


    public static void callAdd() {
        try {
            CloseableHttpClient httpClient = HttpClientUtil.getHttpClient();
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("userName", "lee" + (int) (Math.random() * 10)));
            nvps.add(new BasicNameValuePair("age", (int) (Math.random() * 100) + ""));
            nvps.add(new BasicNameValuePair("verifyId", "1605250678900100000565"));
            nvps.add(new BasicNameValuePair("mobile", "1389999777" + (int) (Math.random() * 10)));
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


    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
//            ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//            try {
//                executorService.submit(new Runnable() {
//                    @Override
//                    public void run() {
            callAdd();
//                    }
//                });
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            } finally {
////                executorService.shutdown();
//            }
        }

    }


}
