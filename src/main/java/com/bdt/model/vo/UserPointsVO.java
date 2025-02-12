package com.yupi.springbootinit.model.vo;

import lombok.Data;

import java.util.Date;

// UserPointsVO.java
@Data
public class UserPointsVO {
    private Integer userPointsId;
    private Integer userId;
    private Integer points;
    private String description;
    private Date createdAt;
}
