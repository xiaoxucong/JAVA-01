CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `goodImg` varchar(255) DEFAULT NULL COMMENT '商品图片',
  `classId` bigint(20) DEFAULT NULL COMMENT '分类Id',
  `number` int(11) DEFAULT NULL COMMENT '数量',
  `desc` text COMMENT '描述',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';
