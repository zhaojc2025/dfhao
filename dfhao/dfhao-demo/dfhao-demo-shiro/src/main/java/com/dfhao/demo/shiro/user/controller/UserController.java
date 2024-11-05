package com.dfhao.demo.shiro.user.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping({"/", "index"})
    public String toIndex(Model model) {
        model.addAttribute("msg", "hello, shiro");
        return "index";
    }

    @RequestMapping("/user/add")
    public String add() {
        return "user/add.html";
    }

    @RequestMapping("/user/update")
    public String update() {
        return "user/update.html";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(String userName, String password, Model model) {
        // 获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户的登陆数据
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        // 登陆
        try {
            subject.login(token);
            return "/index";
        } catch (UnknownAccountException unknownAccountException) {
            System.out.println("用户名不存在,controller");
            model.addAttribute("msg", "用户名不存在");
            return "login";
        } catch (IncorrectCredentialsException incorrectCredentialsException) {
            System.out.println("密码错误,controller");
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    @RequestMapping("/loginMd5")
    public String loginMd5(String userName, String password, Model model) {
        // 获取当前用户
        Subject subject = SecurityUtils.getSubject();

        // 计算加密结果
        // 使用 MD5 加密，随机盐为用户名，加密次数为 199
        String hash = new SimpleHash("MD5", password, userName, 199).toHex();

        //封装用户的登陆数据
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        // 登陆
        try {
            subject.login(token);
            return "/index";
        } catch (UnknownAccountException unknownAccountException) {
            System.out.println("用户名不存在,controller");
            model.addAttribute("msg", "用户名不存在");
            return "login";
        } catch (IncorrectCredentialsException incorrectCredentialsException) {
            System.out.println("密码错误,controller");
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    @RequestMapping("/unauthorized")
    public String unauthorized(Model model) {
        model.addAttribute("msg", "未经授权，无法访问此页");
        return "unauthorized";
    }
}
