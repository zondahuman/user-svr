package com.abin.lee.test;

import com.abin.lee.util.JsonUtil;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: abin
 * Date: 16-12-6
 * Time: 下午3:00
 * To change this template use File | Settings | File Templates.
 */
public class ListJsonTest {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(JsonUtil.toJson(list));
    }
}
