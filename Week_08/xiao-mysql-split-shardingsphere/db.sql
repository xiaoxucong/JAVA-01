/*
Navicat MySQL Data Transfer

Source Server         : docker
Source Server Version : 80023
Source Host           : localhost:3306
Source Database       : db

Target Server Type    : MYSQL
Target Server Version : 80023
File Encoding         : 65001

Date: 2021-03-09 21:26:25
*/

SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------
-- Table structure for order_0
-- ----------------------------
DROP TABLE IF EXISTS `order_0`;
CREATE TABLE `t_order_0` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_1
-- ----------------------------
DROP TABLE IF EXISTS `order_1`;
CREATE TABLE `t_order_1` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_10
-- ----------------------------
DROP TABLE IF EXISTS `order_10`;
CREATE TABLE `t_order_10` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_11
-- ----------------------------
DROP TABLE IF EXISTS `order_11`;
CREATE TABLE `t_order_11` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_12
-- ----------------------------
DROP TABLE IF EXISTS `order_12`;
CREATE TABLE `t_order_12` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_13
-- ----------------------------
DROP TABLE IF EXISTS `order_13`;
CREATE TABLE `t_order_13` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_14
-- ----------------------------
DROP TABLE IF EXISTS `order_14`;
CREATE TABLE `t_order_14` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_15
-- ----------------------------
DROP TABLE IF EXISTS `order_15`;
CREATE TABLE `t_order_15` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_2
-- ----------------------------
DROP TABLE IF EXISTS `order_2`;
CREATE TABLE `t_order_2` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_3
-- ----------------------------
DROP TABLE IF EXISTS `order_3`;
CREATE TABLE `t_order_3` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_4
-- ----------------------------
DROP TABLE IF EXISTS `order_4`;
CREATE TABLE `t_order_4` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_5
-- ----------------------------
DROP TABLE IF EXISTS `order_5`;
CREATE TABLE `t_order_5` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_6
-- ----------------------------
DROP TABLE IF EXISTS `order_6`;
CREATE TABLE `t_order_6` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_7
-- ----------------------------
DROP TABLE IF EXISTS `order_7`;
CREATE TABLE `t_order_7` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_8
-- ----------------------------
DROP TABLE IF EXISTS `order_8`;
CREATE TABLE `t_order_8` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for order_9
-- ----------------------------
DROP TABLE IF EXISTS `order_9`;
CREATE TABLE `t_order_9` (
  `id` bigint NOT NULL,
  `userId` bigint DEFAULT NULL COMMENT '用户id',
  `order_no` varchar(50) DEFAULT NULL COMMENT '订单号',
  `sum_price` decimal(10,2) DEFAULT NULL COMMENT '总价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `paymenttime` datetime DEFAULT NULL COMMENT '支付时间',
  `order_status` int DEFAULT '1' COMMENT '订单状态 0 取消  1 未支付  ,2 已支付未发快递  3 已发快递 4 已收货  5退款退货',
  `express_no` varchar(255) DEFAULT NULL COMMENT '快递编号',
  `express_name` varchar(255) DEFAULT NULL COMMENT '快递名称',
  `consignee_address` varchar(255) DEFAULT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(255) DEFAULT NULL COMMENT '收货人手机号',
  `consignee_name` varchar(255) DEFAULT NULL COMMENT '收货人姓名',
  `deleteStatus` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for t1
-- ----------------------------
