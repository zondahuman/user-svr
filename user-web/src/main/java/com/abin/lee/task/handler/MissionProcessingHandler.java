package com.abin.lee.task.handler;

import com.abin.lee.model.OrderInfo;
import com.abin.lee.service.OrderService;
import com.abin.lee.task.handler.specific.OperatorServiceHandler;
import com.abin.lee.task.process.MissionProcessingTask;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.handler
 */
public class MissionProcessingHandler {

    private MissionProcessingTask job;
    private Integer orderId;
    private OrderInfo orderInfo;



    public MissionProcessingHandler(MissionProcessingTask job, Integer orderId) {
        this.job = job;
        this.orderId = orderId;
    }

    public void start(){
        orderInfo = job.getOrderService().findById(orderId);

        job.getExecutor().submit(new OperatorServiceHandler(this));

    }


    public MissionProcessingTask getJob() {
        return job;
    }

    public void setJob(MissionProcessingTask job) {
        this.job = job;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }
}
