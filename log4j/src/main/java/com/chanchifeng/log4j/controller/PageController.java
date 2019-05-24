package com.chanchifeng.log4j.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:porschan
 * @description:
 * @date: Created in 20:27 2019/2/16
 * @modified By:
 */

@RestController
public class PageController {

    private static Logger logger = LoggerFactory.getLogger(PageController.class);

    @RequestMapping("/home")
    public String home(){
        logger.info("hello log4j.");
        return "hello log4j";
    }
}
