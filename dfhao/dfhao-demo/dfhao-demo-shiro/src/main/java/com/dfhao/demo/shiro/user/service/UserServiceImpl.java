package com.dfhao.demo.shiro.user.service;

import com.dfhao.demo.shiro.user.entry.User;
import com.dfhao.demo.shiro.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserByUserName(String userName) {
        return userMapper.queryUserByUserName(userName);
    }
}
