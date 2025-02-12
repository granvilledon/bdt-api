package com.yupi.springbootinit.model.vo;

import lombok.Data;

import java.util.Date;

// UserVO.java
@Data
public class UserVO {
    private Integer userId;
    private String username;
    private String weChatId;
    private String name;
    private String gender;     // 对应ENUM('M','F')，可用枚举优化
    private String phone;
    private String grade;
    private String avatar;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isDeleted;
}
