package com.chanchifeng.activemq;

import com.chanchifeng.activemq.model.Mood;
import com.chanchifeng.activemq.producer.MoodProducer;
import com.chanchifeng.activemq.service.MoodService;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.jms.Destination;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivemqApplicationTests {

    @Resource
    private MoodService moodService;

    /**
     * 普通的jpa保存至数据库
     */
    @Test
    public void testAyMood(){
        Mood mood = new Mood();
        mood.setId("1");
        //用户阿毅id为1
        mood.setUserId("1");
        mood.setPraiseNum(0);
        //说说内容
        mood.setContent("信息信息信息信息");
        mood.setPublishTime(new Date());
        Mood save = moodService.save(mood);
    }

    @Resource
    private MoodProducer moodProducer;

    /**
     * 测试是否启动activeMQ
     */
    @Test
    public void testActiveMQ() {
        Destination destination = new ActiveMQQueue("message.queue");
        moodProducer.sendMessage(destination, "hello,activeMQ!!!");
    }

    /**
     * 测试异步消息
     */
    @Test
    public void testActiveMQAsynSave() {
        Mood ayMood = new Mood();
        ayMood.setId("3");
        ayMood.setUserId("2");
        ayMood.setPraiseNum(0);
        ayMood.setContent("信息信息信息信息2");
        ayMood.setPublishTime(new Date());
        String msg = moodService.asynSave(ayMood);
        System.out.println("异步发表 :" + msg);

    }
}
