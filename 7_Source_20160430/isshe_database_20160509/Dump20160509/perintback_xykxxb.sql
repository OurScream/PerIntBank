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
-- Table structure for table `xykxxb`
--

DROP TABLE IF EXISTS `xykxxb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xykxxb` (
  `xykid` varchar(20) NOT NULL COMMENT '信用卡号',
  `xykgsrid` varchar(20) NOT NULL COMMENT '信用卡归属人id（外键-关联客户信息表khxxb）',
  `xykzed` double DEFAULT NULL COMMENT '信用卡总额度',
  `xykkyed` double DEFAULT NULL COMMENT '信用卡可用额度',
  `xykyyed` double DEFAULT NULL COMMENT '信用卡已用额度（注意和可用额度命名很像）',
  `xykxhkje` varchar(45) DEFAULT NULL COMMENT '当前（当月）需要还款金额',
  `xykhkrq` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`xykid`),
  KEY `fk_khxxb_khid_idx` (`xykgsrid`),
  CONSTRAINT `fk_khxxb_zjid` FOREIGN KEY (`xykgsrid`) REFERENCES `khxxb` (`zjid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='信用卡信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xykxxb`
--

LOCK TABLES `xykxxb` WRITE;
/*!40000 ALTER TABLE `xykxxb` DISABLE KEYS */;
INSERT INTO `xykxxb` VALUES ('1111','111',10000,NULL,1000,'1000','2016-06-01 00:00:00.000000'),('2222','222',10000,NULL,2000,'200','2016-06-01 00:00:00.000000'),('3333','333',10000,NULL,3000,'30','2016-06-01 00:00:00.000000'),('4444','444',10000,NULL,4000,'400','2016-06-01 00:00:00.000000');
/*!40000 ALTER TABLE `xykxxb` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-09  0:55:18
