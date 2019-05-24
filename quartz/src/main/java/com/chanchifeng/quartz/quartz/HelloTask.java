package com.chanchifeng.quartz.quartz;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author:porschan
 * @description:
 * @date: Created in 15:14 2019/2/17
 * @modified By:
 */

@Component
@Configurable
@EnableScheduling
public class HelloTask {

    //每5秒执行一次
    @Scheduled(cron = "*/5 * *  * * * ")
    public void sayHelloTask(){
        System.out.println("hello quartz");
    }

}
