package com.chanchifeng.mybatis.dao;

import com.chanchifeng.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author:porschan
 * @description:
 * @date: Created in 13:40 2019/2/18
 * @modified By:
 */

@Mapper
public interface UserDao {

    User findByNameAndPassword(@Param("name") String name, @Param("password") String password);

}
