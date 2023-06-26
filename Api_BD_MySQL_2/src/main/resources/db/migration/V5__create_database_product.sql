CREATE TABLE `direto_da_fazenda`.`product` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NOT NULL,
  `price` float NOT NULL,
  `active` TINYINT NULL,
  PRIMARY KEY (`id`)
  );