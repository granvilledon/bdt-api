package com.bdt.model.vo;

import com.bdt.model.enums.TaskStatusEnum;
import com.bdt.model.enums.TaskTypeEnum;
import lombok.Data;

import java.util.Date;

// TaskVO.java
@Data
public class TaskVO {
    private Integer taskId;
    private String name;
    private String description;
    private TaskTypeEnum type;
    private TaskStatusEnum status;
    private Date deadline;
    private Integer creatorId;     // 或关联UserVO
    private Date createdAt;
}
