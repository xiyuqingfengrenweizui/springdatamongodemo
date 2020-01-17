package com.renweiuzi.demo.mongodemo.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 用户User传输对象
 *
 * @author justin.zheng
 * @date 2020/1/16 10:11
 */
@ApiModel
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    private String id;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer age;
    /**
     * 创建时间,时间戳，毫秒
     */
    @ApiModelProperty(value = "创建时间,时间戳，毫秒")
    private Long createTime;


}
