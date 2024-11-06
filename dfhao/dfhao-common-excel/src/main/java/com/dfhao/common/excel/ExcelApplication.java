package com.dfhao.common.excel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc // 允许 Spring Boot 配置 Spring MVC 相关自定义的属性，比如：拦截器、资源处理器、消息转换器等。
@ServletComponentScan // 允许 Spring Boot 扫描和装载当前 包路径 和 子路径 下配置的 Servlet。
@SpringBootApplication(scanBasePackages = "com.dfhao.common.mybatis")
public class ExcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcelApplication.class, args);
    }

}
