package com.chanchifeng.filter.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author:porschan
 * @description:
 * @date: Created in 15:37 2019/2/14
 * @modified By:
 */

@WebListener
public class UserListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext上下文初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext上下文销毁");
    }

}
