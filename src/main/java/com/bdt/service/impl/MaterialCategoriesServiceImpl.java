package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.service.MaterialCategoriesService;
import com.bdt.model.entity.MaterialCategories;
import com.bdt.mapper.MaterialCategoriesMapper;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【material_categories(资料分类表，存储资料的分类信息)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class MaterialCategoriesServiceImpl extends ServiceImpl<MaterialCategoriesMapper, MaterialCategories>
    implements MaterialCategoriesService {

}




