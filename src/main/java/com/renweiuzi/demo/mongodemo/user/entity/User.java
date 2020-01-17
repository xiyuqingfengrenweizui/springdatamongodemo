package com.renweiuzi.demo.mongodemo.user.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author justin.zheng
 * @date 2020/1/16 10:05
 */
@Data
@NoArgsConstructor
@Document(value = "doc_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Id
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 创建时间
     */
    @Field(value = "create_time")
    private Long createTime;


}
