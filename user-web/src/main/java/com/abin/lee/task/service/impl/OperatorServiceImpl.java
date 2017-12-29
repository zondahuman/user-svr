package com.abin.lee.task.service.impl;

import com.abin.lee.model.OrderInfo;
import com.abin.lee.model.TaskInfo;
import com.abin.lee.service.OrderService;
import com.abin.lee.service.TaskService;
import com.abin.lee.task.enums.FlagEnums;
import com.abin.lee.task.service.OperatorService;
import com.abin.lee.task.service.vo.response.ExternalResponse;
import org.apache.commons.lang3.ObjectUtils;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.service.impl
 */
public class OperatorServiceImpl implements OperatorService {

    @Resource
    OrderService orderService;
    @Resource
    TaskService taskService;

    @Override
    public ExternalResponse call(Integer userId, Integer orderId, String taskType) {
        OrderInfo orderInfo = this.orderService.findById(orderId);
        if(ObjectUtils.notEqual(null, orderInfo) && FlagEnums.SUCCESS.name() == orderInfo.getFlag()){
            return ExternalResponse.success();
        }else{
            TaskInfo request = new TaskInfo();
            request.setBussId(orderId+"");
            request.setVersion(0);
            request.setCreateTime(new Date());
            request.setUpdateTime(new Date());
            try {
                request.setFlag(FlagEnums.SUCCESS.name());
                this.orderService.insert(orderInfo);
                return ExternalResponse.success();
            } catch (Exception e) {
                request.setFlag(FlagEnums.FAILURE.name());
                e.printStackTrace();
                return ExternalResponse.failure();
            }
        }
    }
}
