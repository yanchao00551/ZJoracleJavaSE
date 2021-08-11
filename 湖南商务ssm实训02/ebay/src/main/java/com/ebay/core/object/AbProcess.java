package com.ebay.core.object;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:com.ebay.service.rabbitmq
 * @ClassName:AbProcess
 * @Description:
 * @author: 悟空
 * @date: 2021/6/26 14:50
 * @email: 10947@163.com
 */
@Slf4j
public class AbProcess implements Runnable {

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    private List<Message> aBlist = new ArrayList<Message>();



    /**
     * 初始化方法：启动线程
     * @author 悟空
     * @description //TODO
     * @date 17:34 2021/6/27
     * @param
     */
    public void init() {
        taskExecutor.execute(this);
    }

    /**
     * 对外提供添加数据的方法
     * ABList是共享资源，主线程MqHandler对此进行添加，子线程ABProcess对此进行删除，存在线程安全问题，所以需要加同步
     * notify()：此方法必须在synchronized修饰的代码块或者方法中使用
     * @param msg
     */
    public synchronized void addList(Message msg) {
        aBlist.add(msg);
        notify(); // 唤醒在此对象监视器（锁）上等待的单个线程，
    }

    @Override
    public void run() {
        while (true) {
            try {
                thread(); //调用实现方法
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * 因为涉及共享资源的操作，需要同步
     * wait()：此方法必须在synchronized修饰的代码块或者方法中使用
     * @throws Exception
     */
    public synchronized void thread() throws Exception {
        // 判断集合中是否有消息
        if (aBlist.size() > 0) {
            //方法A
            dealB(aBlist.get(0));
            //方法B
            dealC(aBlist.get(0));

            // 处理完后，删除这条数据
            aBlist.remove(0);
            System.out.println("dealABSuccess");
        } else {
            try {
                wait(); // 若集合中没有消息，让线程等待，
            }catch(InterruptedException e) {
                log.info("InterruptedException " , e);
            }
        }
    }


    //TODO:赠送会员积分
    public void dealB(Message msg){
        log.info("已赠送会员积分~~~~~~~");
    }
    //TODO:赠送红包
    public void dealC(Message msg){
        log.info("已赠送红包~~~~~~~~~~~");
    }

}
