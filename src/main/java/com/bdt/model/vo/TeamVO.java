package com.yupi.springbootinit.model.vo;

import lombok.Data;

import java.util.Date;

// TeamVO.java
@Data
public class TeamVO {
    private Integer teamId;
    private String name;
    private String description;
    private Integer leaderId;      // 或关联UserVO
    private Date createdAt;
}
