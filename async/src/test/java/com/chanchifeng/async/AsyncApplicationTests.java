package com.chanchifeng.async;

import com.chanchifeng.async.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        System.out.println("####IndexController####   1");
        userService.sendSms();
        System.out.println("####IndexController####   4");

        System.out.println("------------------------");
//
        System.out.println("####IndexController####   1");
        userService.sendSmsAsync();
        System.out.println("####IndexController####   4");

    }

}
