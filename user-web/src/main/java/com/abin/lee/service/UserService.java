package com.abin.lee.service;

import com.abin.lee.dao.UserInfoMapper;
import com.abin.lee.model.UserInfo;
import com.abin.lee.util.JsonUtil;
import com.abin.lee.vo.UserInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by abin
 * Be Created in 2016/11/29.
 */
@Slf4j
@Service
@Transactional
public class UserService {

    @Resource
    UserInfoMapper userInfoMapper;
    @Resource
    BasicDataSource dataSource;

    public void add(UserInfoDto userInfoDto) throws InvocationTargetException, IllegalAccessException {
        String threadId = Thread.currentThread().getName();
        log.error("add1---threadId={} maxActive={} maxIdle={} maxOpenPreparedStatements={} _numActive={} numIdle={} numTestsPerEvictionRun={}", threadId, dataSource.getMaxActive(), dataSource.getMaxIdle(), dataSource.getMaxOpenPreparedStatements(), dataSource.getNumActive(), dataSource.getNumIdle(), dataSource.getNumTestsPerEvictionRun());

        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfo, userInfoDto);
        userInfo.setCreateTime(new Date());
        userInfo.setUpdateTime(new Date());
        userInfoMapper.insert(userInfo);
//        if(TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
                @Override
                public void afterCompletion(int status) {
                    super.afterCompletion(status);
                    log.error("add2---threadId={} maxActive={} maxIdle={} maxOpenPreparedStatements={} _numActive={} numIdle={} numTestsPerEvictionRun={}", threadId, dataSource.getMaxActive(), dataSource.getMaxIdle(), dataSource.getMaxOpenPreparedStatements(), dataSource.getNumActive(), dataSource.getNumIdle(), dataSource.getNumTestsPerEvictionRun());
                    log.error("afterCompletion---------TransactionSynchronization.STATUS_COMMITTED={} threadId={}", TransactionSynchronization.STATUS_COMMITTED, threadId);
                    if (status == TransactionSynchronization.STATUS_COMMITTED) {
                        log.error("afterCompletion---------status == TransactionSynchronization.STATUS_COMMITTED={} threadId={}", TransactionSynchronization.STATUS_COMMITTED, threadId);

                    }
                }
            });
//        }else{
//            log.error("else---TransactionSynchronizationManager.isActualTransactionActive()=.... ", TransactionSynchronizationManager.isActualTransactionActive());
//        }
        log.error("add3---threadId={} maxActive={} maxIdle={} maxOpenPreparedStatements={} _numActive={} numIdle={} numTestsPerEvictionRun={}", threadId, dataSource.getMaxActive(), dataSource.getMaxIdle(), dataSource.getMaxOpenPreparedStatements(), dataSource.getNumActive(), dataSource.getNumIdle(), dataSource.getNumTestsPerEvictionRun());

    }



    public UserInfo find(Integer id){
        return userInfoMapper.selectByPrimaryKey(id);
    }

}
