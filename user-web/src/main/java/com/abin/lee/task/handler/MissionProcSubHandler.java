package com.abin.lee.task.handler;

import org.apache.log4j.Logger;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.handler
 */
public abstract class MissionProcSubHandler implements Runnable {


    private Logger logger = Logger.getLogger(MissionProcSubHandler.class);

    private static long TIME_OUT = 120L;

    public MissionProcessingHandler task;

    public MissionProcSubHandler(MissionProcessingHandler task) {
        this.task = task;
    }

    @Override
    public void run() {
        try {
            Future<?> future = task.getJob().getExecutor().submit(new Runnable() {
                @Override
                public void run() {
                    call();
                }
            });
            future.get(TIME_OUT, TimeUnit.SECONDS);

        } catch (TimeoutException e) {
            logger.error(getName() + "TIME OUT!", e);
        } catch (Exception e) {
            logger.error("其他异常" + getName(), e);
        }
    }

    public abstract void call();

    public abstract String getName();


    public static long getTimeOut() {
        return TIME_OUT;
    }

    public static void setTimeOut(long timeOut) {
        TIME_OUT = timeOut;
    }

    public MissionProcessingHandler getTask() {
        return task;
    }

    public void setTask(MissionProcessingHandler task) {
        this.task = task;
    }
}
