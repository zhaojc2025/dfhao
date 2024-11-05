package com.dfhao.demo.swagger.test;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@Tag(name = "测试类名称")
public class TestController {

    @GetMapping("/")
    @Operation(description = "get请求接口")
    @Parameter(name = "str", description = "字符串", required = true)
    public String getStr(@RequestParam("str") String str) {
        System.out.println("1");
        return str;
    }

    @PostMapping("/")
    @Operation(summary = "post请求接口", description = "接口描述")
    public void info(@RequestBody Person person) {
        System.out.println("2");
    }
}
