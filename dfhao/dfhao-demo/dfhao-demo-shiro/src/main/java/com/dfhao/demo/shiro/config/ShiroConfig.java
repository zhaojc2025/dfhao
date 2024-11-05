package com.dfhao.demo.shiro.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {


    // 创建 shirofilter
    @Bean("shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 关联 securityManager
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);

        // 配置系统受限资源
        // anon :无需认证就可访问
        // authc：必须认证了才能访问
        // user：必须用户 记住我 功能才能用
        // perms：拥有对某个资源的权限才可以访问
        // roles：拥有某个角色权限才可以访问
        Map<String, String> map = new LinkedHashMap<>();
        // 拦截
//        map.put("/user/add", "anon");
//        map.put("/user/update", "authc");
        // 授权
        map.put("/user/add", "perms[user:add]");
        map.put("/user/update", "perms[user:update]");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

        // 默认登陆页面
        shiroFilterFactoryBean.setLoginUrl("/");
        // 未授权页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");

        // 配置系统公共资源


        return shiroFilterFactoryBean;
    }

    // 创建安全管理器
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(UserMd5Realm realm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置加密算法
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        credentialsMatcher.setHashAlgorithmName("MD5");
        // 设置散列次数
        credentialsMatcher.setHashIterations(199);
        // hex 编码
        credentialsMatcher.setStoredCredentialsHexEncoded(true);
        realm.setCredentialsMatcher(credentialsMatcher);
        // 关联 realm
        securityManager.setRealm(realm);
        return securityManager;
    }

    // 创建 realm 对象
    @Bean("userMd5Realm")
    public UserMd5Realm userRealm() {
        return new UserMd5Realm();
    }

    // 整合 thymeleaf-extras-shiro
    @Bean
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }
}
