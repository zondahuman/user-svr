package com.abin.lee.service.impl;

import com.abin.lee.dao.OrderInfoMapper;
import com.abin.lee.dao.TaskInfoMapper;
import com.abin.lee.model.*;
import com.abin.lee.service.TaskService;
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
public class TaskServiceImpl implements TaskService {
    @Resource
    TaskInfoMapper taskInfoMapper;


    @Override
    public void insert(TaskInfoWithBLOBs model) {
        this.taskInfoMapper.insert(model);
    }

    @Override
    public TaskInfo findById(Integer id) {
        TaskInfo model = new TaskInfo();
        TaskInfoExample ex = new TaskInfoExample();
        ex.createCriteria().andIdEqualTo(id);
        List<TaskInfo> list = this.taskInfoMapper.selectByExample(ex);
        if (CollectionUtils.isNotEmpty(list)) {
            model = list.get(0);
        }
        return model;
    }

    @Override
    public List<TaskInfo> findAll(Integer id, String flag) {
        TaskInfoExample ex = new TaskInfoExample();
        ex.createCriteria().andIdEqualTo(id).andFlagEqualTo(flag);
        List<TaskInfo> list = this.taskInfoMapper.selectByExample(ex);
        return list;
    }





}
