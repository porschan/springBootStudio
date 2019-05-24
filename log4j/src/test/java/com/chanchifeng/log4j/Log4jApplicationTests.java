package com.chanchifeng.log4j;

import com.chanchifeng.log4j.controller.PageController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Log4jApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(PageController.class);

    @Test
    public void contextLoads() {
        logger.info("hello log4j.");
    }

}

