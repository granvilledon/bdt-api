package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.UserPointsMapper;
import com.bdt.service.UserPointsService;
import com.bdt.model.entity.UserPoints;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【user_points(用户积分表，记录每个用户的积分变动)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class UserPointsServiceImpl extends ServiceImpl<UserPointsMapper, UserPoints>
    implements UserPointsService {

}




