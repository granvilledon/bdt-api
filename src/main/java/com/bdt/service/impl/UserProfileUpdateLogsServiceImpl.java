package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.UserProfileUpdateLogsMapper;
import com.bdt.service.UserProfileUpdateLogsService;
import com.bdt.model.entity.UserProfileUpdateLogs;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【user_profile_update_logs(个人资料修改日志表，记录用户修改个人信息的历史)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class UserProfileUpdateLogsServiceImpl extends ServiceImpl<UserProfileUpdateLogsMapper, UserProfileUpdateLogs>
    implements UserProfileUpdateLogsService {

}




