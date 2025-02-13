package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.MaterialsMapper;
import com.bdt.service.MaterialsService;
import com.bdt.model.entity.Materials;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【materials(资料表，存储所有上传的资料信息)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class MaterialsServiceImpl extends ServiceImpl<MaterialsMapper, Materials>
    implements MaterialsService {

}




