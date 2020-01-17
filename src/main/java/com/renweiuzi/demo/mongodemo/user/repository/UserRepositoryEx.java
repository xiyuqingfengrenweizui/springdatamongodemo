package com.renweiuzi.demo.mongodemo.user.repository;

import com.renweiuzi.demo.mongodemo.base.repository.BaseMongoRepositoryEx;
import com.renweiuzi.demo.mongodemo.user.entity.User;

import java.util.List;

/**
 * 用户Repository扩展接口，用于自定义方法
 *
 * @author justin.zheng
 * @date 2020/1/16 10:10
 */
public interface UserRepositoryEx extends BaseMongoRepositoryEx<User, String> {

    /**
     * 根据名称模糊查找
     *
     * @param name 名称
     * @return
     */
    List<User> findByNameEx(String name);
}
