package com.yupi.springbootinit.model.vo;

import com.yupi.springbootinit.model.enums.TaskStatusEnum;
import com.yupi.springbootinit.model.enums.TaskTypeEnum;
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
