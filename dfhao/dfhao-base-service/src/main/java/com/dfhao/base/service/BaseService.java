package com.dfhao.base.service;

import com.dfhao.common.mybatis.CommonServiceImpl;
import com.dfhao.common.mybatis.CommonPageVo;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class BaseService extends CommonServiceImpl<BaseMapper, BaseConditionVo> {

    public CommonPageVo<HashMap<String, Object>> commonPage(BaseConditionVo condition) {
        List<HashMap<String, Object>> page = getBaseMapper().commonPage(condition);
        if (CollectionUtils.isEmpty(page)) {
            return new CommonPageVo<>(condition.getCurrent(), 0, null);
        }
        return new CommonPageVo<>(condition.getCurrent(), page.size(), page);
    }
}
