package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.RequestProcessLogsMapper;
import com.bdt.service.RequestProcessLogsService;
import com.bdt.model.entity.RequestProcessLogs;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【request_process_logs(需求处理记录表，记录管理员对需求的处理过程)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class RequestProcessLogsServiceImpl extends ServiceImpl<RequestProcessLogsMapper, RequestProcessLogs>
    implements RequestProcessLogsService {

}




