package com.renweiuzi.demo.mongodemo.base.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * 公用基础Repository
 * @author justin.zheng
 * @date 2020/1/16 14:52
 */
@NoRepositoryBean
public interface BaseMongoRepository<T, ID extends Serializable> extends MongoRepository<T, ID> {
}
