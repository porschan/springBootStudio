package com.chanchifeng.mybatis.service;

import com.chanchifeng.mybatis.model.User;

/**
 * @author:porschan
 * @description:
 * @date: Created in 13:43 2019/2/18
 * @modified By:
 */

public interface UserService {

    User findByNameAndPassword(String name, String password);

}
