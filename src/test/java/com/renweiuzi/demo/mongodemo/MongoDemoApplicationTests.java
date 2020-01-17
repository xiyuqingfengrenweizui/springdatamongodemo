package com.renweiuzi.demo.mongodemo;

import com.renweiuzi.demo.mongodemo.user.entity.User;
import com.renweiuzi.demo.mongodemo.user.repository.UserRepository;
import com.renweiuzi.demo.mongodemo.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class MongoDemoApplicationTests {

    private static Logger LOGGER = LoggerFactory.getLogger(MongoDemoApplicationTests.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }


    @Test
    void save() {
        User user = new User();
        user.setId("5e2006ef710aa2402fca5e2a");
        user.setName("李斯");
        user.setAge(252);
        user.setCreateTime(System.currentTimeMillis());
        User saveDb = userService.save(user);
        LOGGER.info("==>user save :{}", saveDb.toString());
    }

    @Test
    void findAll() {
        List<User> userList = userService.findAll();
        userList.forEach(user -> LOGGER.info("==>user find in db:{}", user.toString()));
    }

    @Test
    void removeAll() {
        userService.removeAll();
        List<User> userList = userService.findAll();
        Assert.isTrue(userList.size() == 0, "用户未全部删除了");
    }

    @Test
    void findByName(){
        List<User> userList = this.userService.findByName("三");
        userList.forEach(user -> LOGGER.info("==>user findByName in db:{}", user.toString()));

    }


    @Test
    void findByIdEx(){
        String id="5e2006ef710aa2402fca5e2a";
        User user = this.userRepository.findByIdEx(id);
        LOGGER.info("==>findByIdEx:{}",user);

    }

}
