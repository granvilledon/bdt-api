package com.yupi.springbootinit.model.dto.team;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

// TeamDTO.java
@Data
public class TeamDTO {
    @NotBlank
    private String name;
    private String description;
    @NotNull
    private Integer leaderId;
}