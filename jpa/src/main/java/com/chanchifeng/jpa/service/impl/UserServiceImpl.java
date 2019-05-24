package com.chanchifeng.jpa.service.impl;

import com.chanchifeng.jpa.model.User;
import com.chanchifeng.jpa.repository.UserRepository;
import com.chanchifeng.jpa.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

/**
 * @author:porschan
 * @description:
 * @date: Created in 16:36 2019/1/31
 * @modified By:
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

//    @Transactional
    @Override
    public User save(User ayUser) {
        User save = userRepository.save(ayUser);

        String error = null;
        error.split(",");

        return save;
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
        System.out.println("userId:" + id + "用户被删除");
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public List<User> findByName(String name){
        return userRepository.findByName(name);
    }
    @Override
    public List<User> findByNameLike(String name){
        return userRepository.findByNameLike(name);
    }
    @Override
    public List<User> findByIdIn(Collection<String> ids){
        return userRepository.findByIdIn(ids);
    }
}
