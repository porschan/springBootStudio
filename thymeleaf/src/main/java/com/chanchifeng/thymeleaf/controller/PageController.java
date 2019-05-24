package com.chanchifeng.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author:porschan
 * @description:
 * @date: Created in 11:09 2019/2/14
 * @modified By:
 */

@Controller
public class PageController {

    /**
     * 跳转到注册 成功页面
     *
     * @return
     */
    @RequestMapping(value = "home")
    public String success(Map<String, Object> paramMap) {

        /** 默认Map的内容会放到请求域中，页面可以直接取值*/
        paramMap.put("name", "porschan");
        paramMap.put("age", 24);

        /** 会自动跳转到默认的 classpath:/templates/success.html 页面*/
        return "home";
    }

}
