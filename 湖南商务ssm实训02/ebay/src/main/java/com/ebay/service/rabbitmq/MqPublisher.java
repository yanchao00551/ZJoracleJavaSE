package com.ebay.service.rabbitmq;

/**
 * @PackageName:com.ebay.service.rabbitmq
 * @ClassName:MqPublisher
 * @Description:
 * @author: 悟空
 * @date: 2021/6/26 9:14
 * @email: 10947@163.com
 */

import com.ebay.core.bean.DeptEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.AbstractJavaTypeMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 基本消息模型-生产者
 */
@Component
@PropertySource(value = "classpath:rabbitmq.properties")
public class MqPublisher {
    private static final Logger log = LoggerFactory.getLogger(MqPublisher.class);

    //定义RabbitMQ消息操作组件 RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Environment env;

    /**
     * 发送消息
     * @param message 待发送的消息，即一串字符串值
     */
    public void sendMsg(String message){
        //判断字符串值是否为空
        if(!Strings.isNullOrEmpty(message)){
            try{
                //定义消息传输的格式为JSON字符串格式
                rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
                //指定消息模型中的交换机
                rabbitTemplate.setExchange(env.getProperty("mq.basic.info.exchange.name"));
                //指定消息模型中的路由
                rabbitTemplate.setRoutingKey(env.getProperty("mq.basic.info.routing.key.name"));
                //将字符串转化为待发送的消息，即一串二进制的数据流
                Message msg = MessageBuilder.withBody(message.getBytes("utf-8")).build();
                //转化并发送消息
                rabbitTemplate.convertAndSend(msg);
                //打印日志信息
                log.info("基本消息模型-生产者-发送消息：{}",message);
            }catch (Exception e){
                log.error("基本消息模型-生产者-发送消息发生异常：{}",message,e.fillInStackTrace());
            }
        }
    }

    /**
     * 发送对象类型的消息
     * @author 悟空
     */
    public void sendObjectMsg(DeptEntity deptEntity){
        //判断对象是否为null
        if( deptEntity != null){
            try{
                //设置消息在传输过程中的格式，在这里指定为JSON
                rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
                //指定消息模型中的交换机
                rabbitTemplate.setExchange(env.getProperty("mq.basic.info.exchange.name"));
                //指定消息模型中的路由
                rabbitTemplate.setRoutingKey(env.getProperty("mq.basic.info.routing.key.name"));
                //采用convertAndSend方法即可发送消息, 使用mq的消息属性处理类MessagePostProcessor
                rabbitTemplate.convertAndSend(deptEntity, new MessagePostProcessor() {
                    @Override
                    public Message postProcessMessage(Message message) throws AmqpException {
                        //获取消息的属性
                        MessageProperties messageProperties = message.getMessageProperties();
                        //设置消息持久化模式
                        messageProperties.setDeliveryMode(MessageDeliveryMode.PERSISTENT);
                        //设置消息的类型，在这里指定消息类型为Person类型
                        messageProperties.setHeader(AbstractJavaTypeMapper.DEFAULT_CONTENT_CLASSID_FIELD_NAME, DeptEntity.class);
                        //返回消息实例
                        return message;
                    }
                });
                //打印日志信息
                log.info("基本消息模型-生产者-发送消息：{}",deptEntity);
            }catch (Exception e){
                log.error("基本消息模型-生产者-发送对象类型的消息发生异常：{}",deptEntity,e.fillInStackTrace());
            }
        }
    }

}