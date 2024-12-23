package com.dfhao.demo;

import cn.hutool.extra.spring.EnableSpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSpringUtil
public class DemoShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoShiroApplication.class, args);
    }

}
