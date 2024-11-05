package com.dfhao.demo.swagger.test;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Person", description = "用户信息")
public class Person {

    @Schema(name = "name", description = "用户名")
    private String userName;

    @Schema(name = "pwd", description = "密码")
    private String pwd;

    private String userId;
    private String age;

}
