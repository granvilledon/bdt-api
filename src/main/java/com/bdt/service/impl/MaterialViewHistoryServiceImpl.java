package com.bdt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdt.mapper.MaterialViewHistoryMapper;
import com.bdt.service.MaterialViewHistoryService;
import com.bdt.model.entity.MaterialViewHistory;
import org.springframework.stereotype.Service;

/**
* @author YuAiTao
* @description 针对表【material_view_history(资料浏览历史表，记录用户浏览资料的历史)】的数据库操作Service实现
* @createDate 2025-02-13 15:01:12
*/
@Service
public class MaterialViewHistoryServiceImpl extends ServiceImpl<MaterialViewHistoryMapper, MaterialViewHistory>
    implements MaterialViewHistoryService {

}




