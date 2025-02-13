package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.NotificationReceiveLogsMapper;
import com.bdt.service.NotificationReceiveLogsService;
import com.bdt.model.entity.NotificationReceiveLogs;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【notification_receive_logs(通知接收记录表，记录用户接收和阅读通知的状态)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class NotificationReceiveLogsServiceImpl extends ServiceImpl<NotificationReceiveLogsMapper, NotificationReceiveLogs>
    implements NotificationReceiveLogsService {

}




