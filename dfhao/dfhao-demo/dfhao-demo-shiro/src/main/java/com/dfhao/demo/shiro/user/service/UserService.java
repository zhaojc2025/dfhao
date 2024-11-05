package com.dfhao.demo.shiro.user.service;


import com.dfhao.demo.shiro.user.entry.User;

public interface UserService {
    User queryUserByUserName(String userName);
}
