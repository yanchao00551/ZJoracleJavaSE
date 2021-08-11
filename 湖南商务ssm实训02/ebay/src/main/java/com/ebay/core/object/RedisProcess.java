package com.ebay.core.object;

import com.alibaba.druid.util.StringUtils;
import com.ebay.core.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName:com.ebay.core.object
 * @ClassName:RedisProcess
 * @Description:
 * @author: 悟空
 * @date: 2021/6/27 17:02
 * @email: 10947@163.com
 */
public class RedisProcess implements Runnable{
    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    @Autowired
    private RedisUtil redisUtil;

    private String tkey;
    private Object tvalue;
    private String defaultCacheExpireTime;

    public void init(){
        taskExecutor.execute(this);
    }

    //TODO:对外提供添加数据的方法
    public synchronized void addStoreMap(String key,Object value,String defaultCacheExpireTime){
        this.tkey = key;
        this.tvalue = value;
        this.defaultCacheExpireTime = defaultCacheExpireTime;
        notify(); // 唤醒在此对象监视器（锁）上等待的单个线程
    }

    @Override
    public void run() {
        while (true){
            try{
                thread();
            }catch (Exception e){
                e.printStackTrace();;
            }
        }
    }

    public synchronized void thread() throws Exception{
        try{
            if(!StringUtils.isEmpty(tkey)){
                Boolean status = redisUtil.set(tkey, tvalue, Long.parseLong(defaultCacheExpireTime));
                //TODO:处理完后重置数据为null
                if(status){
                    tkey = null;
                    tvalue = null;
                }
            }else {
                wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
