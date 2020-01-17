package com.renweiuzi.demo.mongodemo.base.repository;

import java.io.Serializable;

/**
 * 公用基础Repository扩展接口，用于自定义方法
 *
 * @author justin.zheng
 * @date 2020/1/16 14:55
 */
public interface BaseMongoRepositoryEx<T, ID extends Serializable> {

    /**
     * 根据主键id查询
     *
     * @param id 主键ID
     * @return
     */
    T findByIdEx(ID id);

}
