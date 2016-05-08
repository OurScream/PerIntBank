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
-- Table structure for table `khxxb`
--

DROP TABLE IF EXISTS `khxxb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `khxxb` (
  `zjid` varchar(20) NOT NULL COMMENT '证件号（限制为3位）',
  `khdlmm` varchar(45) DEFAULT NULL COMMENT '客户登录密码',
  `khxm` varchar(10) DEFAULT NULL COMMENT '客户姓名',
  `csrq` date DEFAULT NULL COMMENT '出生日期',
  `hyzk` varchar(5) DEFAULT NULL COMMENT '婚姻状况',
  `ssmz` varchar(5) DEFAULT NULL COMMENT '所属民族',
  `zjlx` varchar(10) DEFAULT NULL COMMENT '证件类型',
  `zjqsrq` date DEFAULT NULL COMMENT '证件有效起始日期',
  `zjjzrq` date DEFAULT NULL COMMENT '证件有效截止日期',
  `khxb` varchar(5) DEFAULT NULL COMMENT '客户性别',
  `khgj` varchar(20) DEFAULT NULL COMMENT '客户国籍',
  `yddh` varchar(20) DEFAULT NULL COMMENT '移动电话',
  `gddh` varchar(20) DEFAULT NULL COMMENT '固定电话',
  `jtdz` varchar(128) DEFAULT NULL COMMENT '家庭地址',
  `jtyb` varchar(10) DEFAULT NULL COMMENT '家庭邮编',
  PRIMARY KEY (`zjid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khxxb`
--

LOCK TABLES `khxxb` WRITE;
/*!40000 ALTER TABLE `khxxb` DISABLE KEYS */;
INSERT INTO `khxxb` VALUES ('111','111','isshe','1995-05-29','未婚','汉','身份证',NULL,NULL,'男','中国','111','0759','湛江','524069'),('222','222','chu','1995-05-29','未婚','汉','身份证',NULL,NULL,'男','中国','122','0755','湛江','222222'),('333','333','dai','1995-05-29','未婚','汉','身份证',NULL,NULL,'男','中国','133','0752','惠州','333333'),('444','444','哈哈','1995-05-29','未婚','汉','身份证',NULL,NULL,'男','中国','144','4444','4444','444444');
/*!40000 ALTER TABLE `khxxb` ENABLE KEYS */;
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
