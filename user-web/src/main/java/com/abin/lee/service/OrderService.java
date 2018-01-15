package com.abin.lee.service;

import com.abin.lee.model.OrderInfo;

import java.util.List;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.service
 */
public interface OrderService {

    void insert(OrderInfo orderInfo);

    void add(String userId);

    OrderInfo findById(Integer id);

    List<OrderInfo> findAll(Integer id, String flag);

    List<OrderInfo> findAll(String flag);

}
