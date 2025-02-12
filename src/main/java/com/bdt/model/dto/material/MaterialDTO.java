package com.yupi.springbootinit.model.dto.material;

import com.yupi.springbootinit.model.enums.MaterialTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Data
public class MaterialDTO {
    @NotBlank
    private String name;
    @NotNull
    private MaterialTypeEnum type;
    @NotBlank
    private String filePath;
    @NotNull
    private Integer authorId;
}