CREATE TABLE `direto_da_fazenda`.`sales` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `cod_product` BIGINT NOT NULL,
  `cod_saler` BIGINT NOT NULL,
  `cod_client` BIGINT NOT NULL,
  `quantity` INT NOT NULL,
  PRIMARY KEY (`id`)
  );