# dfhao

Java 后台项目

## 功能说明
* 系统层
  * 支持代码生成
  * 日志：系统日志、业务日志（登录、操作、异常）
  * 定时任务
  * 接口文档
  * 监控数据库连接池状态
  * 系统鉴权：
* 业务层
  * 用户管理
  * 角色管理
  * 权限管理
  * 菜单管理
  * 部门管理
  * 字典管理
  * 参数管理
  * 文件服务
  * 站内信、消息
  * 

## 模块说明

```
common(公共能力层)-->base(基础特性层)-->product(产品层)

com.dfhao
├── pom.xml               // 父依赖(版本管理)
├── dfhao-admin           // 产品层-后台管理系统 [80]
├── dfhao-shiro           // 基础特性层-shiro模块
├── dfhao-common          // 公共能力层-公共通用
├── dfhao-db              // 公共能力层-数据库
│   └── dfhao-db-api         // 公共能力层-公共、通用
│   └── dfhao-db-flyway         // 公共能力层-数据库版本控制器
```

## dfhao-demo

* 非正式功能
* 仅用于验证各种组件或特性


## dfhao-common-excel

* 公共能力
* 对 excel 导入导出操作的封装


## dfhao-base-service

* 基础特性
* 封装出通用接口，用于配置出的 sql 语句的执行

### 依赖说明

* knife4j
* lombok
* mybatis-plus
* liteflow

## 参考学习

* RuoYi
* roses
* guns

## 开发计划

