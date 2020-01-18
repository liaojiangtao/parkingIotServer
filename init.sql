CREATE TABLE `parking_iot`.`tb_camera`  (
  `id` char(32) NOT NULL COMMENT '主键',
  `ip` varchar(0) NULL COMMENT '相机IP',
  `rstp_port` varchar(0) NULL COMMENT '相机rstp端口',
  `user` varchar(0) NULL COMMENT '相机登录用户名',
  `password` varchar(0) NULL COMMENT '相机登录密码',
  `create_uid` char(32) NULL COMMENT '创建用户ID',
  `update_time` datetime(8) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` datetime(8) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  INDEX `idx_create_uid`(`create_uid`) USING BTREE COMMENT '创建用户uid',
  INDEX `idx_ip`(`ip`) USING BTREE COMMENT '相机IP'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '相机信息表' TABLESPACE = `innodb_system` STORAGE DEFAULT;