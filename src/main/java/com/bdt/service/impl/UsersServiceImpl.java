package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.UsersMapper;
import com.bdt.service.UsersService;
import com.bdt.model.entity.Users;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【users(用户表，存储用户信息)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService {

}




