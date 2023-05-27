CREATE TABLE `tb_user_info` (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `nick_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '昵称',
  `email` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮箱',
  `qq_open_id` varchar(35) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT 'qqOpenId',
  `qq_avatar` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT 'qq头像',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码(md5)',
  `join_time` datetime DEFAULT NULL COMMENT '加入时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后一次登录时间',
  `status` tinyint(1) DEFAULT NULL COMMENT '状态(0: 禁用 1: 启用)',
  `use_space` bigint DEFAULT NULL COMMENT '使用空间，单位byte',
  `total_space` bigint DEFAULT NULL COMMENT '总空间',
  `is_del` tinyint(1) DEFAULT NULL COMMENT '是否删除(0：删除 1：正常)',
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE KEY `key_nick_name` (`nick_name`) USING BTREE COMMENT '唯一索引',
  UNIQUE KEY `key_email` (`email`) USING BTREE COMMENT '唯一索引',
  UNIQUE KEY `key_qq_open_id` (`qq_open_id`) USING BTREE COMMENT '唯一索引'
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户信息';