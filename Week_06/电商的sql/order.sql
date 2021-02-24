CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int(10) DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

