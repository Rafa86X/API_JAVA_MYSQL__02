CREATE DATABASE  IF NOT EXISTS `direto_da_fazenda` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `direto_da_fazenda`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: direto_da_fazenda
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cpf` varchar(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `date_birth` varchar(45) NOT NULL,
  `telephone` varchar(11) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `city` varchar(45) NOT NULL,
  `neighborhood` varchar(45) NOT NULL,
  `street` varchar(45) NOT NULL,
  `number` varchar(12) NOT NULL,
  `complement` varchar(45) DEFAULT NULL,
  `active` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`,`cpf`),
  UNIQUE KEY `id_UNIQUE` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'11122233355','Tuco','Menistão','1975-10-19','51994515286','93052270','Pibobango','flafluringa','ksksksss','123456','',1),(2,'11122233356','Abdu','bacacxi','1975-10-19','51994515286','93052270','Pibobango','flafluringa','ksksksss','123456','',1),(3,'11122233357','Monark','Flouu','1975-10-19','51994515286','93052270','Pibobango','flafluringa','ksksksss','123456','',1);
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flyway_schema_history`
--

DROP TABLE IF EXISTS `flyway_schema_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flyway_schema_history` (
  `installed_rank` int NOT NULL,
  `version` varchar(50) DEFAULT NULL,
  `description` varchar(200) NOT NULL,
  `type` varchar(20) NOT NULL,
  `script` varchar(1000) NOT NULL,
  `checksum` int DEFAULT NULL,
  `installed_by` varchar(100) NOT NULL,
  `installed_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `execution_time` int NOT NULL,
  `success` tinyint(1) NOT NULL,
  PRIMARY KEY (`installed_rank`),
  KEY `flyway_schema_history_s_idx` (`success`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flyway_schema_history`
--

LOCK TABLES `flyway_schema_history` WRITE;
/*!40000 ALTER TABLE `flyway_schema_history` DISABLE KEYS */;
INSERT INTO `flyway_schema_history` VALUES (1,'1','creating seller table','SQL','V1__creating_seller_table.sql',616951456,'root','2023-06-21 18:18:33',121,1),(2,'2','add constraint cpf unique','SQL','V2__add_constraint_cpf_unique.sql',-261370043,'root','2023-06-21 18:18:33',220,1),(3,'3','create table client','SQL','V3__create_table_client.sql',1551440893,'root','2023-06-21 18:18:33',22,1),(4,'4','create table venda','SQL','V4__create_table_venda.sql',-490506243,'root','2023-06-21 18:18:33',30,1),(5,'5','create database product','SQL','V5__create_database_product.sql',-267969516,'root','2023-06-21 20:17:31',220,1),(6,'6','create fks sale','SQL','V6__create_fks_sale.sql',783392916,'root','2023-06-23 11:33:48',1038,1);
/*!40000 ALTER TABLE `flyway_schema_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `minha_view`
--

DROP TABLE IF EXISTS `minha_view`;
/*!50001 DROP VIEW IF EXISTS `minha_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `minha_view` AS SELECT 
 1 AS `id`,
 1 AS `nome_do_vendedor`,
 1 AS `nome_do_cliente`,
 1 AS `descricao_do_produto`,
 1 AS `quantidade_do_produto`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(45) NOT NULL,
  `price` float NOT NULL,
  `active` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'1 Lt Leite puro de vaca',15.9,1),(2,'1 Lt de banha de porco',45.5,1),(3,'1 Kg de queijo',45.5,1),(4,'1 Kg salada mista verde',45.5,1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sales` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cod_product` bigint NOT NULL,
  `cod_saler` bigint NOT NULL,
  `cod_client` bigint NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sale_product` (`cod_product`),
  KEY `fk_sale_saller` (`cod_saler`),
  KEY `fk_sale_client` (`cod_client`),
  CONSTRAINT `fk_sale_client` FOREIGN KEY (`cod_client`) REFERENCES `customers` (`id`),
  CONSTRAINT `fk_sale_product` FOREIGN KEY (`cod_product`) REFERENCES `product` (`id`),
  CONSTRAINT `fk_sale_saller` FOREIGN KEY (`cod_saler`) REFERENCES `sellers` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (1,1,1,1,5),(2,2,2,2,6),(5,3,5,3,4);
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellers`
--

DROP TABLE IF EXISTS `sellers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sellers` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cpf` varchar(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `date_birth` varchar(45) NOT NULL,
  `telephone` varchar(11) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `city` varchar(45) NOT NULL,
  `neighborhood` varchar(45) NOT NULL,
  `street` varchar(45) NOT NULL,
  `number` varchar(12) NOT NULL,
  `complement` varchar(45) DEFAULT NULL,
  `active` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`,`cpf`),
  UNIQUE KEY `UNiq_person_cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellers`
--

LOCK TABLES `sellers` WRITE;
/*!40000 ALTER TABLE `sellers` DISABLE KEYS */;
INSERT INTO `sellers` VALUES (1,'11122233340','PiraPorel','Tartaruga Ninja','1975-10-19','51994515286','93052270','Pibobango','flafluringa','ksksksss','123456','',1),(2,'11122233341','Donatelo','Tartaruga Ninja','1975-10-19','51994515286','93052270','Pibobango','flafluringa','ksksksss','123456','',1),(4,'11122233342','Leonardo','Tartaruga Ninja','1975-10-19','51994515286','93052270','Pibobango','flafluringa','ksksksss','123456','',1),(5,'11122233343','Michelangelo','Tartaruga Ninja','1975-10-19','51994515286','93052270','Pibobango','flafluringa','ksksksss','123456','',1);
/*!40000 ALTER TABLE `sellers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `minha_view`
--

/*!50001 DROP VIEW IF EXISTS `minha_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `minha_view` AS select `s`.`id` AS `id`,`sl`.`name` AS `nome_do_vendedor`,`c`.`name` AS `nome_do_cliente`,`p`.`description` AS `descricao_do_produto`,`s`.`quantity` AS `quantidade_do_produto` from (((`sales` `s` join `customers` `c` on((`s`.`cod_client` = `c`.`id`))) join `sellers` `sl` on((`s`.`cod_saler` = `sl`.`id`))) join `product` `p` on((`s`.`cod_product` = `p`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-23 13:04:29
