CREATE TABLE `sub_ouder` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `goodsId` bigint(20) DEFAULT NULL COMMENT '商品Id',
  `goodsPrice` decimal(10,2) DEFAULT NULL COMMENT '商品单价格',
  `goods_num` int(10) DEFAULT NULL COMMENT '商品数量',
  `orderId` bigint(20) DEFAULT NULL COMMENT '订单主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
