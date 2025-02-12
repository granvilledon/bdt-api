package com.bdt.model.vo;


import com.bdt.model.enums.NotificationTypeEnum;
import lombok.Data;

import java.util.Date;

// NotificationVO.java
@Data
public class NotificationVO {
    private Integer notifyId;
    private String message;
    private NotificationTypeEnum type;
    private Integer senderId;      // 或关联UserVO
    private Integer receiverId;    // 或关联UserVO
    private Boolean isRead;
    private Date createdAt;
}
