package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.UserFavoritesMapper;
import com.bdt.service.UserFavoritesService;
import com.bdt.model.entity.UserFavorites;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【user_favorites(用户收藏表，记录用户收藏的需求信息)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class UserFavoritesServiceImpl extends ServiceImpl<UserFavoritesMapper, UserFavorites>
    implements UserFavoritesService {

}




