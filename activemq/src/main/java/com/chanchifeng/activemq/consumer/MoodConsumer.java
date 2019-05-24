package com.chanchifeng.activemq.consumer;

import com.chanchifeng.activemq.model.Mood;
import com.chanchifeng.activemq.service.MoodService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author:porschan
 * @description: 消费者
 * @date: Created in 13:31 2019/3/4
 * @modified By:
 */

@Component
public class MoodConsumer {

    @JmsListener(destination = "message.queue")
    public void receiveQueue(String text) {
        System.out.println("用户发表【" + text + "】成功");
    }

    @Resource
    private MoodService moodService;

    @JmsListener(destination = "message.queue.asyn.save")
    public void receiveQueue(Mood mood){
        moodService.save(mood);
    }
}
