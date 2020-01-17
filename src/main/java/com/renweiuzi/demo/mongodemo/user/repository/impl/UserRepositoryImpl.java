package com.renweiuzi.demo.mongodemo.user.repository.impl;

import com.renweiuzi.demo.mongodemo.base.repository.impl.SimpleBaseMongoRepositoryEx;
import com.renweiuzi.demo.mongodemo.user.entity.User;
import com.renweiuzi.demo.mongodemo.user.repository.UserRepositoryEx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * 用户管理扩展实现，不需要增加@Component等注解
 *
 * @author justin.zheng
 * @date 2020/1/16 14:36
 */
public class UserRepositoryImpl extends SimpleBaseMongoRepositoryEx<User, String> implements UserRepositoryEx {

    @Override
    public List<User> findByNameEx(String name) {
        logger.info("findByNameEx");
        Criteria criteria = Criteria.where("name").regex(name);
        Query query = new Query(criteria);
        return this.mongoTemplate.find(query, User.class);


    }
}
