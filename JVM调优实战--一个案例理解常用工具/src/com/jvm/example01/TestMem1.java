package com.jvm.example01;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 从数据库中读取信用数据，套用模型，并把结果进行记录和传输
 */
public  class TestMem1 {



    private static ThreadPoolExecutor executor = ScheduledThreadPoolExecutorSimple.getInstance();

    public static void main(String[] args) throws Exception {
        executor.setMaximumPoolSize(50);

        for (;;){
            modelFit();
            Thread.sleep(100);
            Thread.yield(); //让出CPU资源
        }
    }

    private static void modelFit(){
        List<CardInfoLoader> taskList = getAllCardInfo();

        taskList.forEach(info -> {
            // do something
            executor.prestartAllCoreThreads();
            executor.execute(TaskInfoSimple.getInstance(info));
        });
    }

    private static List<CardInfoLoader> getAllCardInfo(){
        List<CardInfoLoader> taskList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            taskList.add(CardInfoLoader.getInstance());
        }
        return taskList;
    }



}
