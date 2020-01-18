CREATE TABLE `parking_iot`.`tb_camera`  (
  `id` char(32) NOT NULL COMMENT '����',
  `ip` varchar(0) NULL COMMENT '���IP',
  `rstp_port` varchar(0) NULL COMMENT '���rstp�˿�',
  `user` varchar(0) NULL COMMENT '�����¼�û���',
  `password` varchar(0) NULL COMMENT '�����¼����',
  `create_uid` char(32) NULL COMMENT '�����û�ID',
  `update_time` datetime(8) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
  `create_time` datetime(8) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
  PRIMARY KEY (`id`),
  INDEX `idx_create_uid`(`create_uid`) USING BTREE COMMENT '�����û�uid',
  INDEX `idx_ip`(`ip`) USING BTREE COMMENT '���IP'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '�����Ϣ��' TABLESPACE = `innodb_system` STORAGE DEFAULT;