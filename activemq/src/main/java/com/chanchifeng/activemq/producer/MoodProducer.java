package com.chanchifeng.activemq.producer;

import com.chanchifeng.activemq.model.Mood;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * @author:porschan
 * @description: 生产者
 * @date: Created in 13:30 2019/3/4
 * @modified By:
 */

@Service
public class MoodProducer {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessage(Destination destination, final String message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }

    public void sendMessage(Destination destination, final Mood mood) {
        jmsMessagingTemplate.convertAndSend(destination, mood);
    }

}
