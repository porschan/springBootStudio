package com.chanchifeng.async.service.impl;

import com.chanchifeng.async.service.UserService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author:porschan
 * @description:
 * @date: Created in 13:13 2019/3/6
 * @modified By:
 */


@Service
public class UserServiceImpl implements UserService {

    @Override
    public void sendSms() {
        System.out.println("####sendSms####   2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("####sendSms####   3");
    }


    @Async
    @Override
    public void sendSmsAsync(){
        System.out.println("####sendSms####   2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("####sendSms####   3");
    }

}
