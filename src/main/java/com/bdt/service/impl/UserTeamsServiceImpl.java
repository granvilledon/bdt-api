package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.UserTeamsMapper;
import com.bdt.model.entity.UserTeams;
import com.bdt.service.UserTeamsService;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【user_teams(用户与团队的关联表，记录用户加入的团队)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class UserTeamsServiceImpl extends ServiceImpl<UserTeamsMapper, UserTeams>
    implements UserTeamsService{

}




