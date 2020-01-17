package com.renweiuzi.demo.mongodemo.user.repository;

import com.renweiuzi.demo.mongodemo.base.repository.BaseMongoRepository;
import com.renweiuzi.demo.mongodemo.user.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 用户Repository
 *
 * @author justin.zheng
 * @date 2020/1/16 10:10
 */
@Repository
public interface UserRepository extends BaseMongoRepository<User, String>, UserRepositoryEx {
}
