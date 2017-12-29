package com.abin.lee.task.process;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.process
 */
@Component
public class MissionProcessingTask {
    private static ExecutorService executor = new ThreadPoolExecutor(100,1000,0, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(30),
            new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Income_process_thread").build(),new ThreadPoolExecutor.AbortPolicy());





    public void run(){

    }



    public static ExecutorService getExecutor() {
        return executor;
    }

    public static void setExecutor(ExecutorService executor) {
        MissionProcessingTask.executor = executor;
    }
}
