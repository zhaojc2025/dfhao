# dfhao

Java 后台项目

## 模块说明

* dfhao-admin 后台单体项目，聚合用户中心等
* dfhao-common 
* dfhao-base

* 层级关系：common(公共能力层)-->base(基础特性层)-->product(产品层)

## dfhao-demo

* 非正式功能
* 仅用于验证各种组件或特性

## dfhao-common

* 公共能力
* 共通方法、工具

## dfhao-common-mybatis

* 公共能力
* 对数据库操作的基础封装，目前基于 mybatis-plus 进行封装，目的是方便替换成其他的组件

## dfhao-common-excel

* 公共能力
* 对 excel 导入导出操作的封装

## dfhao-base-shiro

* 基础特性
* shiro 组件

## dfhao-base-service

* 基础特性
* 封装出通用接口，用于配置出的 sql 语句的执行

## dfhao-admin

后台管理项目

### 依赖说明

* knife4j
* lombok
* mybatis-plus
* liteflow

## 参考学习

* 若依

## 开发计划

