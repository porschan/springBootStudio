package com.chanchifeng.springbootaopclasslog.config;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@Aspect
public class AOPConfig {

    @Around("@within(org.springframework.web.bind.annotation.RestController)")
    public Object simpleAop(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println("入参: " + JSONObject.toJSONString(Arrays.asList(args)));
        // 调用原有的方法
        Object object = proceedingJoinPoint.proceed();
        System.out.println("返参: " + object);
        return object;
    }
}