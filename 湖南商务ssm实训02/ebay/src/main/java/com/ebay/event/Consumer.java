package com.ebay.event;

import com.ebay.core.event.DeptEntityEvent;
import com.ebay.dao.DeptMapper;
import com.ebay.entity.Dept;
import com.ebay.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

/**
 * 消费者
 * @PackageName:com.ebay.event
 * @ClassName:Consumer
 * @Description:
 * @author: 悟空
 * @date: 2021/6/25 15:08
 * @email: 10947@163.com
 */
@Slf4j
@Component
@EnableAsync
public class Consumer implements ApplicationListener<DeptEntityEvent> {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    @Async
    public void onApplicationEvent(DeptEntityEvent event) {
        Dept dept = event.getDept();
        Integer status = deptMapper.insert(dept);
        if(status > 0){
            log.info("确认消费成功！");
        }else{
            log.info("消息消费失败!~~~~~~~~~~~");
        }
    }
}
