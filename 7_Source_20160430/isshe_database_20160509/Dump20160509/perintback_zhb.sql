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
-- Table structure for table `zhb`
--

DROP TABLE IF EXISTS `zhb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhb` (
  `zhid` varchar(20) NOT NULL COMMENT '账户ID（卡号）',
  `zjid` varchar(20) NOT NULL COMMENT '证件号',
  `zhmm` varchar(20) DEFAULT NULL COMMENT '账户密码',
  `zhxz` varchar(5) DEFAULT NULL COMMENT '账户性质',
  `zhsx` varchar(5) DEFAULT NULL COMMENT '账户属性:正常，挂失。',
  `dqye` double DEFAULT NULL COMMENT '当前余额',
  `kyye` double DEFAULT NULL COMMENT '可用余额',
  `cq` int(11) DEFAULT NULL COMMENT '存期',
  `bzid` int(11) DEFAULT NULL COMMENT '币种ID，这个是外码，不知道该怎么关联',
  `lilv` float DEFAULT NULL COMMENT '利率',
  `khrq` date DEFAULT NULL COMMENT '开户日期',
  `khdd` varchar(128) DEFAULT NULL COMMENT '开户地点',
  PRIMARY KEY (`zhid`),
  KEY `fk_币种号_idx` (`bzid`),
  KEY `fk_khxxb_zjid` (`zjid`),
  CONSTRAINT `fk_bsb_bzid` FOREIGN KEY (`bzid`) REFERENCES `bzb` (`bzid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhb`
--

LOCK TABLES `zhb` WRITE;
/*!40000 ALTER TABLE `zhb` DISABLE KEYS */;
INSERT INTO `zhb` VALUES ('11','111','11','活期','正常',0,1111,0,1,3.5,'2016-05-09','惠州学院'),('22','222','22','活期','挂失',4089,2222,NULL,1,3.5,'2016-05-09','惠州学院'),('33','333','33','定期','正常',3281,3333,5,1,10,'2016-05-09','惠州学院'),('44','444','44','活期','正常',417,4444,NULL,1,3.5,'2016-05-09','惠州学院');
/*!40000 ALTER TABLE `zhb` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-09  0:55:16
