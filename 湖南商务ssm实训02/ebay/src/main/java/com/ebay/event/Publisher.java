package com.ebay.event;

import com.ebay.core.event.DeptEntityEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @PackageName:com.ebay.event
 * @ClassName:Publisher
 * @Description:
 * @author: 悟空
 * @date: 2021/6/25 15:02
 * @email: 10947@163.com
 */
@Component
public class Publisher {

    /**
     * 定义发送消息组件
     * @author 悟空
     * @description //TODO
     * @date 15:03 2021/6/25
     * @param null
     * @return null
     */
    @Autowired
    private ApplicationEventPublisher publisher;

    /**
     * 发送消息
     * @author 悟空
     * @description //TODO
     * @date 15:05 2021/6/25
     * @param

     */
    public void sendMsg(){
        DeptEntityEvent deptEntity = new DeptEntityEvent(this);
        deptEntity.setCreateTime(new Date());
        deptEntity.setDname("发消息");
        deptEntity.setIoc("消息说明");
        publisher.publishEvent(deptEntity);
    }



}
