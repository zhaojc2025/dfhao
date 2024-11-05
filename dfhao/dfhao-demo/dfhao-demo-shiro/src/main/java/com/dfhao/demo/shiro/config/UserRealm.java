package com.dfhao.demo.shiro.config;

import com.dfhao.demo.shiro.user.entry.Auth;
import com.dfhao.demo.shiro.user.entry.User;
import com.dfhao.demo.shiro.user.service.AuthService;
import com.dfhao.demo.shiro.user.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private AuthService authService;

    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权:" + Thread.currentThread().getName());
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        List<Auth> authList = authService.queryAuthByUserId(user.getId());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        authList.forEach(auth -> {
            info.addStringPermission(auth.getAuthInfo());
        });
        return info;
    }

    // 认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证:" + Thread.currentThread().getName());

        // 获取登陆的用户名
        String userName = (String) authenticationToken.getPrincipal();

//        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;

        User user = userService.queryUserByUserName(userName);
        // 用户名认证
        if (user == null || StringUtils.isBlank(user.getUserName())) {
            System.out.println("用户名不存在，抛出异常");
            return null; // 扔出用户名不存在异常
        }
        // 密码认证
        return new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
    }
}
