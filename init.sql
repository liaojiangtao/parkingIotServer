DROP TABLE IF EXISTS `parking_iot`.`tb_camera`;
CREATE TABLE `parking_iot`.`tb_camera`  (
                                           `id` char(32) NOT NULL COMMENT '主键',
                                           `ip` varchar(255) NULL COMMENT '相机IP',
                                           `serial_number` varchar(255) NULL COMMENT '设备序列号',
                                           `rstp_port` int(4) NULL COMMENT '相机rstp端口',
                                           `user` varchar(255) NULL COMMENT '相机登录用户名',
                                           `password` varchar(255) NULL COMMENT '相机登录密码',
                                           `create_uid` char(32) NULL COMMENT '创建用户ID',
                                           `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                                           `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                           PRIMARY KEY (`id`),
                                           INDEX `idx_camera_create_uid`(`create_uid`) USING BTREE COMMENT '创建用户uid',
                                           INDEX `idx_camera_ip`(`ip`) USING BTREE COMMENT '相机IP'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '相机信息表';

DROP TABLE IF EXISTS `parking_iot`.`tb_gate`;
CREATE TABLE `parking_iot`.`tb_gate`  (
                                           `id` char(32) NOT NULL COMMENT '主键',
                                           `name` varchar(255) NULL COMMENT '出入口名称',
                                           `main_camera_id` char(32) NULL COMMENT '关联主相机ID',
                                           `auxiliary_camera_id` char(32) NULL COMMENT '关联辅相机ID',
                                           `type` int(4) NOT NULL COMMENT '出入口类型 1--入口 2--出口',
                                           `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
                                           `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
                                           PRIMARY KEY (`id`),
                                           INDEX `idx_gate_name`(`name`) USING BTREE COMMENT '出入口名称',
                                           INDEX `idx_gate_main_camera`(`main_camera_id`) USING BTREE COMMENT '主相机',
                                           INDEX `idx_gate_auxiliary_camera`(`auxiliary_camera_id`) USING BTREE COMMENT '辅相机'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '出入口';

DROP TABLE IF EXISTS `parking_iot`.`tb_parking_order`;
CREATE TABLE `parking_iot`.`tb_parking_order`  (
                                           `id` char(32) NOT NULL COMMENT '主键',
                                           `order_code` varchar(255) NOT NULL COMMENT '订单编号',
                                           `number_plate` char(8) NOT NULL COMMENT '车牌号',
                                           `arrive_time` datetime(0) NOT NULL COMMENT '入场时间',
                                           `arrive_gate_id` char(32) NOT NULL COMMENT '入场入口ID',
                                           `arrive_gate_name` varchar(255) NOT NULL COMMENT '入场入口名称',
                                           `arrive_type` tinyint(4) NOT NULL COMMENT '入场方式 1--自动 2--人工放行',
                                           `leave_time` datetime(0) NULL COMMENT '离场时间',
                                           `leave_gate_id` char(32) NULL COMMENT '离场出口ID',
                                           `leave_gate_name` varchar(255) NULL COMMENT '离场出口名称',
                                           `leave_type` tinyint(4) NULL COMMENT '离场方式 1--自动 2--人工放行',
                                           `toll_id` char(32) NULL COMMENT '收费员id',
                                           `toll_name` varchar(255) NULL COMMENT '收费员名称',
                                           `total_fee` int(8) NULL COMMENT '订单总费用',
                                           `pay_fee` int(8) NULL COMMENT '订单实际支付费用',
                                           `status` tinyint(4) NOT NULL COMMENT '订单状态 1--停车中 2--已结束 3--异常放行',
                                           `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                                           `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                           PRIMARY KEY (`id`),
                                           INDEX `idx_order_plateNumber`(`number_plate`) USING BTREE COMMENT '车牌号'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表';