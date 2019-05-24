package com.chanchifeng.mybatis;

import com.chanchifeng.mybatis.model.User;
import com.chanchifeng.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    @Resource
    UserService userService;

    @Test
    public void testMybatis(){
        User user = userService.findByNameAndPassword("porschan", "e10adc3949ba59abbe56e057f20f883e");
        System.out.println(user.toString());
    }

}
