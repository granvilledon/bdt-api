package com.yupi.springbootinit.model.dto.team;

import lombok.Data;

import javax.validation.constraints.NotNull;

// UserTeamDTO.java（用于添加成员）
@Data
public class UserTeamDTO {
    @NotNull
    private Integer userId;
    @NotNull
    private Integer teamId;
}
