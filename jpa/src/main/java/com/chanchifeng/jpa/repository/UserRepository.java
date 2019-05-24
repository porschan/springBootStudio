package com.chanchifeng.jpa.repository;

import com.chanchifeng.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

/**
 * @author:porschan
 * @description:
 * @date: Created in 16:33 2019/1/31
 * @modified By:
 */

public interface UserRepository extends JpaRepository<User,String> {
    /**
     * 描述：通过名字相等查询，参数为 name
     * 相当于：select u from ay_user u where u.name = ?1
     */
    List<User> findByName(String name);

    /**
     * 描述：通过名字like查询，参数为 name
     * 相当于：select u from ay_user u where u.name like ?1
     */
    List<User> findByNameLike(String name);

    /**
     * 描述：通过主键id集合查询，参数为 id集合
     * 相当于：select u from ay_user u where id in(?,?,?)
     * @param ids
     */
    List<User> findByIdIn(Collection<String> ids);
}
