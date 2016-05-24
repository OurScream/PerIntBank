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
-- Table structure for table `kfxxb`
--

DROP TABLE IF EXISTS `kfxxb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kfxxb` (
  `kfid` bigint(20) NOT NULL COMMENT '客服id，看如何自动生成唯一的。',
  `kfmc` varchar(10) DEFAULT NULL COMMENT '客服名称',
  `kfdh` varchar(20) DEFAULT NULL COMMENT '客服电话',
  `kfemail` varchar(45) DEFAULT NULL COMMENT '客服email',
  PRIMARY KEY (`kfid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客服信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kfxxb`
--

LOCK TABLES `kfxxb` WRITE;
/*!40000 ALTER TABLE `kfxxb` DISABLE KEYS */;
INSERT INTO `kfxxb` VALUES (1,'iss','133','isshe@'),(2,'hv','157','hv@'),(3,'ljl','67','ljl@'),(4,'tjt','97','tjt@'),(5,'lj','6594','lj@');
/*!40000 ALTER TABLE `kfxxb` ENABLE KEYS */;
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
