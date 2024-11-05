package com.dfhao.demo.shiro.user.service;

import com.dfhao.demo.shiro.user.entry.Auth;

import java.util.List;

public interface AuthService {
    List<Auth> queryAuthByUserId(int userId);
}
