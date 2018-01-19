package com.abin.lee.service.impl;

import com.abin.lee.dao.OrderInfoMapper;
import com.abin.lee.model.OrderInfo;
import com.abin.lee.model.OrderInfoExample;
import com.abin.lee.service.OrderService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
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
    @Async
//    @Transactional(propagation = Propagation.REQUIRED)
    public void add(String userId) {
        try {
            //这里添加等待就是为了延迟返回，占用连接
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setUpdateTime(new Date());
        orderInfo.setCreateTime(new Date());
        orderInfo.setFlag("SUCCESS");
        orderInfo.setUserId(userId);
        orderInfo.setVersion(0);
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

    @Override
    public List<OrderInfo> findAll(String flag) {
        OrderInfoExample ex = new OrderInfoExample();
        ex.createCriteria().andFlagEqualTo(flag);
        List<OrderInfo> list = this.orderInfoMapper.selectByExample(ex);
        return list;
    }
}
