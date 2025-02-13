package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.NotificationsMapper;
import com.bdt.service.NotificationsService;
import com.bdt.model.entity.Notifications;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【notifications(通知表，存储系统发送的所有通知信息)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class NotificationsServiceImpl extends ServiceImpl<NotificationsMapper, Notifications>
    implements NotificationsService {

}




