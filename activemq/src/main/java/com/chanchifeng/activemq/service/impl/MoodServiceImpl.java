package com.chanchifeng.activemq.service.impl;

import com.chanchifeng.activemq.model.Mood;
import com.chanchifeng.activemq.producer.MoodProducer;
import com.chanchifeng.activemq.repository.MoodRepository;
import com.chanchifeng.activemq.service.MoodService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * @author:porschan
 * @description:
 * @date: Created in 13:16 2019/3/4
 * @modified By:
 */

@Service
public class MoodServiceImpl implements MoodService {
    @Resource
    private MoodRepository moodRepository;

    @Override
    public Mood save(Mood mood) {
        return moodRepository.save(mood);
    }

    /**
     * 队列
     */
    private static Destination destination = new ActiveMQQueue("message.queue.asyn.save");

    @Resource
    private MoodProducer moodProducer;

    @Override
    public String asynSave(Mood mood) {
        //往队列ay.queue.asyn.save推送消息，消息内容为说说实体
        moodProducer.sendMessage(destination,mood);
        return "success";
    }
}
