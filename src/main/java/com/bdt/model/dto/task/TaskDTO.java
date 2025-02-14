package com.bdt.model.dto.task;


import com.bdt.model.enums.TaskTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

// TaskDTO.java
@Data
public class TaskDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotNull
    private TaskTypeEnum type;
    private Date deadline;
    @NotNull
    private Integer creatorId;
}
