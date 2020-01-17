package com.renweiuzi.demo.mongodemo.base.repository.impl;

import com.renweiuzi.demo.mongodemo.base.repository.BaseMongoRepositoryEx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 公用基础Repository扩展实现，不需要增加@Component等注解
 * @author justin.zheng
 * @date 2020/1/16 14:54
 */
public class SimpleBaseMongoRepositoryEx<T,ID extends Serializable>
        implements BaseMongoRepositoryEx<T, ID> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected MongoTemplate mongoTemplate;

    protected Class getEntityClass(){
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        return  (Class) actualTypeArguments[0];

// 用一句话获取就是下面一行代码，只是去除了中间变量，可读性差了些
//        Class tCls = (Class) (((ParameterizedType) (this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]);
    }


    @Override
    public T findByIdEx(ID id) {
        Criteria criteria = Criteria.where("_id").is(id);
        Query query = new Query(criteria);
        return (T) mongoTemplate.findOne(query,getEntityClass());
    }
}
