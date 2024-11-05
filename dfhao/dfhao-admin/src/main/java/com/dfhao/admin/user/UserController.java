package com.dfhao.admin.user;

import com.yomahub.liteflow.builder.el.LiteFlowChainELBuilder;
import com.yomahub.liteflow.core.FlowExecutor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "测试类名称")
public class UserController {
    @Resource
    private FlowExecutor flowExecutor;

    @GetMapping("/")
    @Operation(summary = "")
    @Parameter(name = "str", description = "字符串", required = true)
    public String getStr(@RequestParam("str") String str) {
        System.out.println("1");
        return str;
    }

    @GetMapping("/liteFlow")
    @Operation(summary = "逻辑流验证")
    public void liteFlow() {
        LiteFlowChainELBuilder.createChain().setChainId("test11").setEL("THEN(a, b)").build();

        flowExecutor.execute2Resp("test11");
    }

    @PostMapping("/")
    @Operation(summary = "post请求接口")
    public void info(@RequestBody UserVo person) {
        System.out.println("2");
    }
}
