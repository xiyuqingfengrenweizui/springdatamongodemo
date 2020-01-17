package com.renweiuzi.demo.mongodemo.user.service.impl;

import com.renweiuzi.demo.mongodemo.user.entity.User;
import com.renweiuzi.demo.mongodemo.user.repository.UserRepository;
import com.renweiuzi.demo.mongodemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author justin.zheng
 * @date 2020/1/16 10:19
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void removeAll() {
        this.userRepository.deleteAll();
    }

    @Override
    public void remove(String id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public User findById(String id) {
//       return this.userRepository.findByIdEx(id);
        return this.userRepository.findById(id).get();
    }

    @Override
    public List<User> findByName(String name) {
        return this.userRepository.findByNameEx(name);
    }
}
