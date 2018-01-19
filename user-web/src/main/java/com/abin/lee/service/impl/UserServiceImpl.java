package com.abin.lee.service.impl;

import com.abin.lee.dao.UserInfoMapper;
import com.abin.lee.model.UserInfo;
import com.abin.lee.service.OrderService;
import com.abin.lee.service.UserService;
import com.abin.lee.util.JsonUtil;
import com.abin.lee.vo.UserInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.service.impl
 */
@Slf4j
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    UserInfoMapper userInfoMapper;
    @Resource
    OrderService orderService;
    @Resource
    BasicDataSource dataSource;

    public void add(UserInfoDto userInfoDto) throws InvocationTargetException, IllegalAccessException {
        String threadId = Thread.currentThread().getName();
//        log.error("add1---threadId={} maxActive={} maxIdle={} maxOpenPreparedStatements={} _numActive={} numIdle={} numTestsPerEvictionRun={}", threadId, dataSource.getMaxActive(), dataSource.getMaxIdle(), dataSource.getMaxOpenPreparedStatements(), dataSource.getNumActive(), dataSource.getNumIdle(), dataSource.getNumTestsPerEvictionRun());
//        try {
            UserInfo userInfo = new UserInfo();
            BeanUtils.copyProperties(userInfo, userInfoDto);
            userInfo.setCreateTime(new Date());
            userInfo.setUpdateTime(new Date());
            userInfo.setVersion(0);
            userInfoMapper.insert(userInfo);
//        if(TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
                @Override
                public void afterCompletion(int status) {
                    super.afterCompletion(status);
//                log.error("add2---threadId={} maxActive={} maxIdle={} maxOpenPreparedStatements={} _numActive={} numIdle={} numTestsPerEvictionRun={}", threadId, dataSource.getMaxActive(), dataSource.getMaxIdle(), dataSource.getMaxOpenPreparedStatements(), dataSource.getNumActive(), dataSource.getNumIdle(), dataSource.getNumTestsPerEvictionRun());
//                log.error("afterCompletion---------TransactionSynchronization.STATUS_COMMITTED={} threadId={}", TransactionSynchronization.STATUS_COMMITTED, threadId);
                    if (status == TransactionSynchronization.STATUS_COMMITTED) {
//                        log.error("afterCompletion---------status == TransactionSynchronization.STATUS_COMMITTED={} threadId={} maxActive={} maxIdle={} maxOpenPreparedStatements={} _numActive={} numIdle={} numTestsPerEvictionRun={}", TransactionSynchronization.STATUS_COMMITTED, threadId, dataSource.getMaxActive(), dataSource.getMaxIdle(), dataSource.getMaxOpenPreparedStatements(), dataSource.getNumActive(), dataSource.getNumIdle(), dataSource.getNumTestsPerEvictionRun());
                        String userId = userInfo.getId() + "";
                        orderService.add(userId);
                    }
                }
            });
//        } catch (Exception e) {
//            e.printStackTrace();
//            log.error("userInfo={}", JsonUtil.toJson(userInfoDto), e);
////            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//        }
//        }else{
//            log.error("else---TransactionSynchronizationManager.isActualTransactionActive()=.... ", TransactionSynchronizationManager.isActualTransactionActive());
//        }
//        log.error("add3---threadId={} maxActive={} maxIdle={} maxOpenPreparedStatements={} _numActive={} numIdle={} numTestsPerEvictionRun={}", threadId, dataSource.getMaxActive(), dataSource.getMaxIdle(), dataSource.getMaxOpenPreparedStatements(), dataSource.getNumActive(), dataSource.getNumIdle(), dataSource.getNumTestsPerEvictionRun());

    }


    public UserInfo find(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
