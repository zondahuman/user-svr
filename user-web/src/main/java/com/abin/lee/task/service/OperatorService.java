package com.abin.lee.task.service;

import com.abin.lee.task.service.vo.response.ExternalResponse;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.service
 */
public interface OperatorService {

    ExternalResponse call(Integer userId, Integer orderId, String taskType);



}
