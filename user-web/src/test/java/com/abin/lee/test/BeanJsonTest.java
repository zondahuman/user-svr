package com.abin.lee.test;

import java.util.List;

import com.abin.lee.util.JsonUtil;
import com.google.common.collect.Lists;

/**
 * Created with IntelliJ IDEA.
 * User: abin
 * Date: 16-12-6
 * Time: 下午3:00
 * To change this template use File | Settings | File Templates.
 */
public class BeanJsonTest {
    public static void main(String[] args) {
        List<Order> list = Lists.newArrayList();
        list.add(new Order(1, "abin1"));
        list.add(new Order(2, "abin2"));
        System.out.println(JsonUtil.toJson(list));
    }

    public static class Order{
        private int id;
        private String name;

        public Order() {
        }

        public Order(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
