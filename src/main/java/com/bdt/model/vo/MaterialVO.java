package com.yupi.springbootinit.model.vo;

import com.yupi.springbootinit.model.enums.AuditStatusEnum;
import com.yupi.springbootinit.model.enums.MaterialStatusEnum;
import com.yupi.springbootinit.model.enums.MaterialTypeEnum;
import lombok.Data;

import java.util.Date;

// MaterialVO.java
@Data
public class MaterialVO {
    private Integer materialId;
    private String name;
    private MaterialTypeEnum type;
    private MaterialStatusEnum status;
    private String filePath;
    private Integer authorId;       // 或关联UserVO
    private Integer downloadCount;
    private Date createdAt;
    private Date updatedAt;
    private AuditStatusEnum auditStatus;
}
