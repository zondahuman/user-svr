package com.abin.lee.task.handler.specific;

import com.abin.lee.task.enums.ConditionEnums;
import com.abin.lee.task.handler.MissionProcSubHandler;
import com.abin.lee.task.handler.MissionProcessingHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;

/**
 * Created by abin on 2017/12/30 2017/12/30.
 * user-svr
 * com.abin.lee.task.handler.specific
 */
@Slf4j
public class OperatorServiceHandler extends MissionProcSubHandler {

    private Logger logger = Logger.getLogger(OperatorServiceHandler.class);

    private static final String name = "【运营商】";

    public OperatorServiceHandler(MissionProcessingHandler task) {
        super(task);
    }
    @Override
    public void call() {
        try {
            log.info("【定时任务】" + name + "开始，进件ID：" + task.getOrderId());
            task.getJob()
                    .getOperatorService()
                    .call(-1, task.getOrderId(), ConditionEnums.OPERATOR.name());
            log.info("【定时任务】" + name + "结束，进件ID：" + task.getOrderId());
        } catch (Exception e) {
            log.error("【定时任务】异常" + name + "，进件ID：" + task.getOrderId(), e);
        }
    }

    @Override
    public String getName() {
        return null;
    }
}
