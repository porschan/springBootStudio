package com.chanchifeng.mybatis.service.impl;

import com.chanchifeng.mybatis.dao.UserDao;
import com.chanchifeng.mybatis.model.User;
import com.chanchifeng.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:porschan
 * @description:
 * @date: Created in 13:44 2019/2/18
 * @modified By:
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User findByNameAndPassword(String name, String password) {
        return userDao.findByNameAndPassword(name, password);
    }
}
