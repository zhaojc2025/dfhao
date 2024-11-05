package com.dfhao.base.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dfhao.common.mybatis.CommonMapper;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseMapper extends CommonMapper<BaseConditionVo> {

    List<HashMap<String, Object>> commonPage(IPage<BaseConditionVo> page);

}
