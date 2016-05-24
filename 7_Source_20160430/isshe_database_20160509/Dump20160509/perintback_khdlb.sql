-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: perintback
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `khdlb`
--

DROP TABLE IF EXISTS `khdlb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `khdlb` (
  `khzjid` varchar(20) NOT NULL COMMENT '客户证件号码',
  `khdlmm` varchar(45) DEFAULT NULL COMMENT '客户登录密码',
  `khdlsj` time(6) DEFAULT NULL COMMENT '客户登录时间',
  `dqsj` time(6) DEFAULT NULL COMMENT '当前时间',
  `khydlsj` varchar(45) DEFAULT NULL COMMENT '用户已登录时间',
  PRIMARY KEY (`khzjid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户登录表:如何在登录时添加，断线时删除？如何实现登录计时？（后面三个元素可能不用）';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khdlb`
--

LOCK TABLES `khdlb` WRITE;
/*!40000 ALTER TABLE `khdlb` DISABLE KEYS */;
/*!40000 ALTER TABLE `khdlb` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-09  0:55:17
