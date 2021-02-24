CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL COMMENT '姓名',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `lastsigntime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';
