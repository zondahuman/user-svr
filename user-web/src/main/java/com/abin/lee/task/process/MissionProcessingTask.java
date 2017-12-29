package com.abin.lee.task.process;

import com.abin.lee.model.OrderInfo;
import com.abin.lee.service.OrderService;
import com.abin.lee.task.enums.FlagEnums;
import com.abin.lee.task.handler.MissionProcessingHandler;
import com.abin.lee.task.service.OperatorService;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.process
 */
@Slf4j
@Component
public class MissionProcessingTask {
    private static ExecutorService executor = new ThreadPoolExecutor(100, 1000, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(30),
            new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Income_process_thread").build(), new ThreadPoolExecutor.AbortPolicy());

    @Resource
    OrderService orderService;
    @Autowired
    OperatorService operatorService;

    public void run() {
        List<OrderInfo> list = this.orderService.findAll(FlagEnums.FAILURE.name());
        for (OrderInfo orderInfo : list) {
            try {

                MissionProcessingHandler task = new MissionProcessingHandler(this, orderInfo.getId());
                task.start();

            } catch (Exception e) {
                log.error("【定时任务】初始化任务异常 orderInfo:" + orderInfo, e);
            }
        }
    }


    public static ExecutorService getExecutor() {
        return executor;
    }

    public static void setExecutor(ExecutorService executor) {
        MissionProcessingTask.executor = executor;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OperatorService getOperatorService() {
        return operatorService;
    }

    public void setOperatorService(OperatorService operatorService) {
        this.operatorService = operatorService;
    }
}
