package com.jvm.example01;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @PackageName:com.jvm
 * @ClassName:ScheduledThreadPoolExecutorSimple
 * @Description:
 * @author: 悟空
 * @date: 2021/6/28 22:05
 * @email: 10947@163.com
 */
public class ScheduledThreadPoolExecutorSimple {
    //类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
    private static ThreadPoolExecutor instance;

    //构造器私有化
    private ScheduledThreadPoolExecutorSimple(){
        DelayQueue queue = new DelayQueue<>();//延迟队列
        instance = new ThreadPoolExecutor(50,50,3000l,TimeUnit.MILLISECONDS,queue);
    }

    //方法同步，调用效率低
    public static synchronized ThreadPoolExecutor getInstance(){
        if(instance==null){
            new ScheduledThreadPoolExecutorSimple();
        }
        return instance;
    }
}
