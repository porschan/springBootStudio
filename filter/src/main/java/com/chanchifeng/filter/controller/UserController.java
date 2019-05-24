package com.chanchifeng.filter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:porschan
 * @description:
 * @date: Created in 14:54 2019/2/14
 * @modified By:
 */

@RestController
public class UserController {

    @RequestMapping("/home")
    public String home(){
        return "test Filter";
    }

}
