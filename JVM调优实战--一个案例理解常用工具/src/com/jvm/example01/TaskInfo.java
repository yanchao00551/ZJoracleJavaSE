package com.jvm.example01;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @PackageName:com.jvm
 * @ClassName:TaskInfo
 * @Description:
 * @author: ЮђПе
 * @date: 2021/6/29 8:55
 * @email: 10947@163.com
 */
class TaskInfo implements Delayed,Runnable {

    private CardInfoLoader cardInfoLoader;

    public TaskInfo(CardInfoLoader cardInfoLoader) {
        this.cardInfoLoader = cardInfoLoader;
    }


    @Override
    public void run() {
        cardInfoLoader.m();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}