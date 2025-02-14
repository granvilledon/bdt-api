package com.bdt.model.dto.notification;

import com.bdt.model.enums.NotificationTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

// NotificationDTO.java
@Data
public class NotificationDTO {
    @NotBlank
    private String message;
    @NotNull
    private NotificationTypeEnum type;
    @NotNull
    private Integer senderId;
    @NotNull
    private Integer receiverId;
}