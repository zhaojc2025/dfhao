package com.dfhao.base.service;

import com.dfhao.common.mybatis.CommonPageVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.HashMap;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
@Tag(name = "通用sql查询")
public class BaseController {
    @Resource
    private BaseService baseService;

    @PostMapping("/page")
    @Operation(summary = "分页查询")
    public CommonPageVo<HashMap<String, Object>> commonPage(@RequestBody BaseConditionVo baseConditionVo) {
        return baseService.commonPage(baseConditionVo);
    }
}
