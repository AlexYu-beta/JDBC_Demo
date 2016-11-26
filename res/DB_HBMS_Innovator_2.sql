-- MySQL dump 10.13  Distrib 5.7.15, for Linux (x86_64)
--
-- Host: localhost    Database: DB_HBMS_Innovator
-- ------------------------------------------------------
-- Server version	5.7.13-0ubuntu0.16.04.2

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
-- Table structure for table `Appeal`
--

DROP TABLE IF EXISTS `Appeal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Appeal` (
  `appealID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `appealTime` datetime DEFAULT NULL,
  `userID` varchar(10) DEFAULT NULL,
  `webMarketerID` varchar(10) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `appealState` tinyint(4) DEFAULT NULL,
  `orderID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`appealID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Appeal`
--

LOCK TABLES `Appeal` WRITE;
/*!40000 ALTER TABLE `Appeal` DISABLE KEYS */;
INSERT INTO `Appeal` VALUES (1,'2016-11-26 18:00:01','0300000001','0100000001','I just cannot understand',0,1);
/*!40000 ALTER TABLE `Appeal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CommentInfo`
--

DROP TABLE IF EXISTS `CommentInfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CommentInfo` (
  `commentID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `hotelID` int(10) unsigned NOT NULL,
  `score` int(11) DEFAULT NULL,
  `comment` varchar(200) DEFAULT NULL,
  `picture1` varchar(50) DEFAULT NULL,
  `picture2` varchar(50) DEFAULT NULL,
  `picture3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`commentID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CommentInfo`
--

LOCK TABLES `CommentInfo` WRITE;
/*!40000 ALTER TABLE `CommentInfo` DISABLE KEYS */;
INSERT INTO `CommentInfo` VALUES (1,'2016-11-26 10:00:01',1,5,'nice but noise','NOPIC','NOPIC','NOPIC');
/*!40000 ALTER TABLE `CommentInfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CreditRecord`
--

DROP TABLE IF EXISTS `CreditRecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CreditRecord` (
  `creditRecordID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `userID` varchar(10) DEFAULT NULL,
  `changeType` tinyint(4) DEFAULT NULL,
  `reasonType` tinyint(4) DEFAULT NULL,
  `amount` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`creditRecordID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CreditRecord`
--

LOCK TABLES `CreditRecord` WRITE;
/*!40000 ALTER TABLE `CreditRecord` DISABLE KEYS */;
INSERT INTO `CreditRecord` VALUES (1,'2016-11-26 10:00:01','0300000001',0,0,648);
/*!40000 ALTER TABLE `CreditRecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Hotel`
--

DROP TABLE IF EXISTS `Hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Hotel` (
  `hotelID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `region` varchar(50) DEFAULT NULL,
  `introduction` varchar(200) DEFAULT NULL,
  `star` tinyint(4) DEFAULT NULL,
  `environment1` varchar(50) DEFAULT NULL,
  `environment2` varchar(50) DEFAULT NULL,
  `environment3` varchar(50) DEFAULT NULL,
  `facility` varchar(200) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`hotelID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Hotel`
--

LOCK TABLES `Hotel` WRITE;
/*!40000 ALTER TABLE `Hotel` DISABLE KEYS */;
INSERT INTO `Hotel` VALUES (1,'motel168','department 10, South Zhongshan Rd. ','Jiangsu/Nanjing/Xinjiekou','a lovely hotel far away from peace',4,'NOPIC','NOPIC','NOPIC','basically equipped',5);
/*!40000 ALTER TABLE `Hotel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HotelPromotion`
--

DROP TABLE IF EXISTS `HotelPromotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `HotelPromotion` (
  `hotelPromotionID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `hotelID` int(10) unsigned NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `minRankAvailable` int(11) DEFAULT NULL,
  `maxRankAvailable` int(11) DEFAULT NULL,
  PRIMARY KEY (`hotelPromotionID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HotelPromotion`
--

LOCK TABLES `HotelPromotion` WRITE;
/*!40000 ALTER TABLE `HotelPromotion` DISABLE KEYS */;
INSERT INTO `HotelPromotion` VALUES (1,1,'double 11 promotion','50% off!!!','2016-11-26','2017-11-10',1,100);
/*!40000 ALTER TABLE `HotelPromotion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OrderList`
--

DROP TABLE IF EXISTS `OrderList`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OrderList` (
  `orderID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `generateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `cancelTime` datetime DEFAULT NULL,
  `executeDDL` datetime DEFAULT NULL,
  `hotelID` int(10) unsigned NOT NULL,
  `orderState` tinyint(4) DEFAULT NULL,
  `checkinTime` datetime DEFAULT NULL,
  `checkoutTime` datetime DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `hasChild` tinyint(4) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OrderList`
--

LOCK TABLES `OrderList` WRITE;
/*!40000 ALTER TABLE `OrderList` DISABLE KEYS */;
INSERT INTO `OrderList` VALUES (1,'2016-11-26 10:00:01',NULL,'2017-01-01 18:00:00',1,0,NULL,NULL,2,0,328);
/*!40000 ALTER TABLE `OrderList` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RoomInfo`
--

DROP TABLE IF EXISTS `RoomInfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RoomInfo` (
  `roomintoID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `hotelID` int(10) unsigned NOT NULL,
  `roomID` varchar(10) DEFAULT NULL,
  `roomType` varchar(30) DEFAULT NULL,
  `roomPrice` int(11) DEFAULT NULL,
  `roomState` tinyint(4) DEFAULT NULL,
  `detailedInfo1` datetime DEFAULT NULL,
  `detailedInfo2` datetime DEFAULT NULL,
  PRIMARY KEY (`roomintoID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RoomInfo`
--

LOCK TABLES `RoomInfo` WRITE;
/*!40000 ALTER TABLE `RoomInfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `RoomInfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `userID` varchar(10) DEFAULT NULL,
  `accountName` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `contact` varchar(30) DEFAULT NULL,
  `portrait` varchar(50) DEFAULT NULL,
  `creditValue` bigint(20) DEFAULT NULL,
  `memberType` tinyint(4) DEFAULT NULL,
  `memberInfo` varchar(30) DEFAULT NULL,
  `rank` smallint(6) DEFAULT NULL,
  `hotelID` int(10) unsigned NOT NULL,
  `workID` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `WebPromotion`
--

DROP TABLE IF EXISTS `WebPromotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `WebPromotion` (
  `webPromotionID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `webPromotionType` tinyint(4) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `minRankAvailable` int(11) DEFAULT NULL,
  `maxRankAvailable` int(11) DEFAULT NULL,
  `regionAvailableList` varchar(3003) DEFAULT NULL,
  PRIMARY KEY (`webPromotionID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `WebPromotion`
--

LOCK TABLES `WebPromotion` WRITE;
/*!40000 ALTER TABLE `WebPromotion` DISABLE KEYS */;
/*!40000 ALTER TABLE `WebPromotion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-26 18:02:40
