package com.abin.lee.service;

import com.abin.lee.model.OrderInfo;
import com.abin.lee.model.TaskInfo;
import com.abin.lee.model.TaskInfoWithBLOBs;

import java.util.List;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.service
 */
public interface TaskService {

    void insert(TaskInfoWithBLOBs orderInfo);

    TaskInfo findById(Integer id);

    List<TaskInfo> findAll(Integer id, String flag);

}
