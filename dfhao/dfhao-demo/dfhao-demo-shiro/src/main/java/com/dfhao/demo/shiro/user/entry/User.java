package com.dfhao.demo.shiro.user.entry;

import lombok.Data;

@Data
public class User {
    private int id;
    private String userCode;
    private String userName;
    private String password;
}
