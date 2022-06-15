DROP TABLE IF EXISTS `test`;
DROP TABLE IF EXISTS `test1`;
CREATE TABLE `test` (
  `id` bigint NOT NULL COMMENT 'id',
  `name` varchar(50) COMMENT 'name',
  `password` varchar(50) COMMENT 'name',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


SELECT * FROM test;