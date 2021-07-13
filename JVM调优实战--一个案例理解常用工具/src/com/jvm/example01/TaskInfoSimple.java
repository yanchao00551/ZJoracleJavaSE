package com.jvm.example01;

/**
 * @PackageName:com.jvm
 * @ClassName:ScheduledThreadPoolExecutorSimple
 * @Description:
 * @author: 悟空
 * @date: 2021/6/28 22:05
 * @email: 10947@163.com
 */
public class TaskInfoSimple {
    //类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
    private static TaskInfo instance;

    //构造器私有化
    private TaskInfoSimple(CardInfoLoader cardInfoLoader){
        instance = new TaskInfo(cardInfoLoader);
    }

    //方法同步，调用效率低
    public static synchronized TaskInfo getInstance(CardInfoLoader cardInfoLoader){
        if(instance==null){
            instance = new TaskInfo(cardInfoLoader);
        }
        return instance;
    }
}
