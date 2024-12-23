-- 用户表
DROP TABLE IF EXISTS `t_user_t`;
CREATE TABLE `t_user_t`
(
    `id`        int unsigned NOT NULL COMMENT '主键',
    `user_code` varchar(32) NOT NULL COMMENT '用户编码',
    `user_name` varchar(64) NULL COMMENT '用户名称',
    `password`  varchar(32) NOT NULL COMMENT '密码',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';


-- 角色表
DROP TABLE IF EXISTS `t_role_t`;
CREATE TABLE `t_role_t` (
  `id` int unsigned NOT NULL COMMENT '主键',
  `role_code` varchar(32) NOT NULL COMMENT '角色编码',
  `role_name` varchar(32) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色表';


-- 用户角色关联表
DROP TABLE IF EXISTS `t_user_role_t`;
CREATE TABLE `t_user_role_t` (
  `id` int unsigned NOT NULL COMMENT '主键',
  `user_id` int unsigned NOT NULL COMMENT '用户主键',
  `role_id` int unsigned NOT NULL COMMENT '角色主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户角色关联表';


-- 权限表
DROP TABLE IF EXISTS `t_permission_t`;
CREATE TABLE `t_permission_t`
(
    `id`     int unsigned NOT NULL COMMENT '主键',
    `permission_name`   varchar(32) NULL COMMENT '权限名称',
    `permission_dtl` varchar(256) NULL COMMENT '权限配置',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='权限表';


-- 角色权限关联表
DROP TABLE IF EXISTS `t_role_permission_t`;
CREATE TABLE `t_role_permission_t` (
  `id` int unsigned NOT NULL COMMENT '主键',
  `role_id` int unsigned NOT NULL COMMENT '角色主键',
  `permission_id` int unsigned NOT NULL COMMENT '权限主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色权限关联表';


-- 菜单表
DROP TABLE IF EXISTS `t_menu_t`;
CREATE TABLE `t_menu_t`
(
    `id`     int unsigned NOT NULL COMMENT '主键',
    `menu_code`   varchar(32) NULL COMMENT '菜单编码',
    `menu_name`   varchar(32) NULL COMMENT '菜单名称',
    `menu_url` varchar(256) NULL COMMENT '菜单路径',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='菜单表';


-- 角色菜单关联表
DROP TABLE IF EXISTS `t_role_menu_t`;
CREATE TABLE `t_role_menu_t` (
  `id` int unsigned NOT NULL COMMENT '主键',
  `role_id` int unsigned NOT NULL COMMENT '角色主键',
  `menu_id` int unsigned NOT NULL COMMENT '菜单主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色菜单关联表';
