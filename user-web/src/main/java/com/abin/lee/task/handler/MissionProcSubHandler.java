package com.abin.lee.task.handler;

import org.apache.log4j.Logger;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.handler
 */
public abstract class MissionProcSubHandler implements Runnable {


    private Logger logger = Logger.getLogger(MissionProcSubHandler.class);

    private static long TIME_OUT = 120L;

    MissionProcessingHandler task;

    public MissionProcSubHandler(MissionProcessingHandler task) {
        this.task = task;
    }

    @Override
    public void run() {

    }





}
