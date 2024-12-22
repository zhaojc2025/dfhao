DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t`
(
    `id`        int unsigned NOT NULL COMMENT '用户主键',
    `user_code` varchar(32) NOT NULL COMMENT '用户编码',
    `user_name` varchar(64) NULL COMMENT '用户名称',
    `password`  varchar(32) NOT NULL COMMENT '密码',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';

DROP TABLE IF EXISTS `auth_t`;
CREATE TABLE `auth_t`
(
    `id`        int unsigned NOT NULL COMMENT '权限主键',
    `user_id`   int unsigned NULL COMMENT '用户主键',
    `auth_info` varchar(64) NULL COMMENT '权限信息',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='权限表';