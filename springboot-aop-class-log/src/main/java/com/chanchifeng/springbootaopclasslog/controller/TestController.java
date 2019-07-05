package com.chanchifeng.springbootaopclasslog.controller;

import com.chanchifeng.springbootaopclasslog.form.UserForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(String name) {
        return "Hello, Aop !";
    }

    @PostMapping("/login")
    public String login(@RequestBody UserForm userForm) {
        return "Hello, Aop2 !";
    }

}
