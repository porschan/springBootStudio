package com.chanchifeng.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void stringRedisTemplateTest() {
        //验证key是否存在；true存在，false不存在
        Boolean isSucc = stringRedisTemplate.hasKey("name");
        System.out.println("isSucc: " + isSucc);

        //设置key=1
        stringRedisTemplate.opsForValue().set("name", "porschan");

        //读取key的值
        String name = stringRedisTemplate.opsForValue().get("name");
        System.out.println("name: " + name);

        //设置key的值
        stringRedisTemplate.opsForValue().set("name","1");

        //将key的值+1 ；  如果要减1 就填入 -1
        Long number = stringRedisTemplate.boundValueOps("name").increment(1);
        System.out.println("number: " + number);

        //删除某key
        Boolean isDelete = stringRedisTemplate.delete("name");
        System.out.println("isDelete: " + isDelete);

    }

}

