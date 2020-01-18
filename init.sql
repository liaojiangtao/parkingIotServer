DROP TABLE IF EXISTS `parking_iot`.`tb_camera`;
CREATE TABLE `parking_iot`.`tb_camera`  (
                                           `id` char(32) NOT NULL COMMENT '����',
                                           `ip` varchar(255) NULL COMMENT '���IP',
                                           `serial_number` varchar(255) NULL COMMENT '�豸���к�',
                                           `rstp_port` int(4) NULL COMMENT '���rstp�˿�',
                                           `user` varchar(255) NULL COMMENT '�����¼�û���',
                                           `password` varchar(255) NULL COMMENT '�����¼����',
                                           `create_uid` char(32) NULL COMMENT '�����û�ID',
                                           `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
                                           `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
                                           PRIMARY KEY (`id`),
                                           INDEX `idx_camera_create_uid`(`create_uid`) USING BTREE COMMENT '�����û�uid',
                                           INDEX `idx_camera_ip`(`ip`) USING BTREE COMMENT '���IP'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '�����Ϣ��';

DROP TABLE IF EXISTS `parking_iot`.`tb_gate`;
CREATE TABLE `parking_iot`.`tb_gate`  (
                                           `id` char(32) NOT NULL COMMENT '����',
                                           `name` varchar(255) NULL COMMENT '���������',
                                           `main_camera_id` char(32) NULL COMMENT '���������ID',
                                           `auxiliary_camera_id` char(32) NULL COMMENT '���������ID',
                                           `type` int(4) NOT NULL COMMENT '��������� 1--��� 2--����',
                                           `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
                                           `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
                                           PRIMARY KEY (`id`),
                                           INDEX `idx_gate_name`(`name`) USING BTREE COMMENT '���������',
                                           INDEX `idx_gate_main_camera`(`main_camera_id`) USING BTREE COMMENT '�����',
                                           INDEX `idx_gate_auxiliary_camera`(`auxiliary_camera_id`) USING BTREE COMMENT '�����'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '�����';