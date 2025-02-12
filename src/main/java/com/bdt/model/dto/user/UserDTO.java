package com.yupi.springbootinit.model.dto.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;

// UserDTO.java（用于创建/更新）
@Data
public class UserDTO {
    @NotBlank(message = "用户名不能为空")
    private String username;
    private String weChatId;
    private String name;
    private String gender;
    private String phone;
    private String grade;
    private String avatar;
}