package com.ebay.service.rabbitmq;

import com.ebay.core.bean.DeptEntity;
import com.ebay.core.object.AbProcess;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 监听器
 * @author 悟空
 */
@Component
@Slf4j
public class MqReceiver implements ChannelAwareMessageListener {

    
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    @Qualifier(value = "abProcess")
    private AbProcess abProcess;


    private static Logger logger = LoggerFactory.getLogger(MqReceiver.class);


    /**
     * 监听消息
     * @author 悟空
     */
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        try {

            abProcess.addList(message);

            //TODO:发送短信留给主线程Main执行
            dealF(message);
            final Boolean success = dealA(message);
            if(success){
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            }

        }catch (Exception e){
            logger.error("获取消息内容异常",e);
            e.printStackTrace();
        }
    }

    /**
     * 注册
     * @author 悟空
     */
    private Boolean dealA(Message msg){
        byte[] bytes = msg.getBody();
        try {
            DeptEntity deptEntity = objectMapper.readValue(bytes, DeptEntity.class);
            log.info("监听到的消息:{}",deptEntity.getDept());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }



/*
    //TODO:赠送现金券
    public void dealD(Message msg){
        log.info("已赠送现金券~~~~~~~~~");
    }

    //TODO:赠送小礼品
    public void dealE(Message msg){
        log.info("已赠送小礼品~~~~~~~~~~");
    }
*/


    /**
     * 发送短信通知用户
     * @author 悟空
     */
    private void dealF(Message msg){
        log.info("已发送短信通知用户~~~~~~~~~~");
    }


}
