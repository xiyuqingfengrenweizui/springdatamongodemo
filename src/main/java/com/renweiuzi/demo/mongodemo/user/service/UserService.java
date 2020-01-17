package com.renweiuzi.demo.mongodemo.user.service;

import com.renweiuzi.demo.mongodemo.user.entity.User;

import java.util.List;

/**
 * @author justin.zheng
 * @date 2020/1/16 10:17
 */
public interface UserService {

    /**
     * 保存或更新
     * @param user
     */
    User save(User user);

    List<User> findAll();

    void removeAll();

    void remove(String id);

    User findById(String id);

    List<User> findByName(String name);


}
