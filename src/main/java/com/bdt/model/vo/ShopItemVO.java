package com.yupi.springbootinit.model.vo;

import lombok.Data;

import java.util.Date;

// ShopItemVO.java
@Data
public class ShopItemVO {
    private Integer itemId;
    private String name;
    private String description;
    private Integer pointsRequired;
    private Integer stock;
    private Date createdAt;
    private Date updatedAt;
}
