package com.abin.lee.service.impl;

import com.abin.lee.dao.OrderInfoMapper;
import com.abin.lee.model.OrderInfo;
import com.abin.lee.model.OrderInfoExample;
import com.abin.lee.service.OrderService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.service
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderInfoMapper orderInfoMapper;


    @Override
    public void insert(OrderInfo orderInfo) {
        this.orderInfoMapper.insert(orderInfo);
    }

    @Override
    public OrderInfo findById(Integer id) {
        OrderInfo orderInfo = new OrderInfo();
        OrderInfoExample ex = new OrderInfoExample();
        ex.createCriteria().andIdEqualTo(id);
        List<OrderInfo> list = this.orderInfoMapper.selectByExample(ex);
        if (CollectionUtils.isNotEmpty(list)) {
            orderInfo = list.get(0);
        }
        return orderInfo;
    }

    @Override
    public List<OrderInfo> findAll(Integer id, String flag) {
        OrderInfoExample ex = new OrderInfoExample();
        ex.createCriteria().andIdEqualTo(id).andFlagEqualTo(flag);
        List<OrderInfo> list = this.orderInfoMapper.selectByExample(ex);
        return list;
    }


}
