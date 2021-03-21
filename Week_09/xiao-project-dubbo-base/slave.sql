CREATE TABLE `wallet` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userId` int DEFAULT NULL COMMENT '用户id',
  `money` int unsigned DEFAULT NULL COMMENT '余额',
  `amount` int unsigned DEFAULT NULL COMMENT '美元',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户钱包';
INSERT INTO `db`.`wallet` (`id`, `userId`, `money`, `amount`) VALUES ('1', '1', '1', NULL);
CREATE TABLE `wallet_frozen` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userId` int DEFAULT NULL COMMENT '用户id',
  `money` int unsigned DEFAULT NULL COMMENT '冻结余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户冻结钱包';
INSERT INTO `db`.`wallet_frozen` (`id`, `userId`, `money`) VALUES ('1', '1', '0');



