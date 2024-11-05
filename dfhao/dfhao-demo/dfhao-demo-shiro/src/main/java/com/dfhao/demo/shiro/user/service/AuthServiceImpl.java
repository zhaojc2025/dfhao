package com.dfhao.demo.shiro.user.service;

import com.dfhao.demo.shiro.user.entry.Auth;
import com.dfhao.demo.shiro.user.mapper.AuthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthMapper authMapper;

    public List<Auth> queryAuthByUserId(int userId) {
        return authMapper.queryAuthByUserId(userId);
    }
}
