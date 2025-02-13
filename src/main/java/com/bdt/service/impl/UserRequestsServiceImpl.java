package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.UserRequestsMapper;
import com.bdt.service.UserRequestsService;
import com.bdt.model.entity.UserRequests;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【user_requests(用户需求表，记录用户发布的需求信息)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class UserRequestsServiceImpl extends ServiceImpl<UserRequestsMapper, UserRequests>
    implements UserRequestsService {

}




