-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 24, 2024 at 04:22 PM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supplierdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `supplier_id` bigint NOT NULL AUTO_INCREMENT,
  `company_name` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `nature_of_business` enum('LARGE_SCALE','MEDIUM_SCALE','SMALL_SCALE') DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`supplier_id`, `company_name`, `location`, `nature_of_business`, `website`) VALUES
(1, 'Tech Moulders', 'New York', 'SMALL_SCALE', 'http://techmoulders.com'),
(2, '3D Innovations', 'San Francisco', 'MEDIUM_SCALE', 'http://3dinnovations.com'),
(3, 'Precision Casting Co.', 'Chicago', 'LARGE_SCALE', 'http://precisioncasting.com'),
(4, 'Global Manufacturing', 'Los Angeles', 'SMALL_SCALE', 'http://globalmanufacturing.com'),
(5, 'Eco-Friendly Coating Ltd.', 'New York', 'MEDIUM_SCALE', 'http://ecocoating.com'),
(6, 'Advanced 3D Solutions', 'Austin', 'SMALL_SCALE', 'http://advanced3d.com'),
(7, 'Moulding Masters', 'Detroit', 'LARGE_SCALE', 'http://mouldingmasters.com'),
(8, 'Casting Experts Inc.', 'Seattle', 'MEDIUM_SCALE', 'http://castingexperts.com'),
(9, 'Innovative Coatings', 'Miami', 'SMALL_SCALE', 'http://innovativecoatings.com'),
(10, 'Global Moulding Solutions', 'Denver', 'LARGE_SCALE', 'http://globalmoulding.com');

-- --------------------------------------------------------

--
-- Table structure for table `supplier_manufacturing_processes`
--

DROP TABLE IF EXISTS `supplier_manufacturing_processes`;
CREATE TABLE IF NOT EXISTS `supplier_manufacturing_processes` (
  `supplier_supplier_id` bigint NOT NULL,
  `manufacturing_processes` enum('CASTING','COATING','MOULDING','_3D_PRINTING') DEFAULT NULL,
  KEY `FKmw9wopla0lpflwpunut587gcm` (`supplier_supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `supplier_manufacturing_processes`
--

INSERT INTO `supplier_manufacturing_processes` (`supplier_supplier_id`, `manufacturing_processes`) VALUES
(1, 'MOULDING'),
(1, 'CASTING'),
(2, 'COATING'),
(2, '_3D_PRINTING'),
(3, 'COATING'),
(3, 'CASTING'),
(4, 'MOULDING'),
(4, '_3D_PRINTING'),
(5, 'COATING'),
(6, '_3D_PRINTING'),
(7, 'MOULDING'),
(7, 'CASTING'),
(8, 'CASTING'),
(9, 'COATING'),
(9, '_3D_PRINTING'),
(10, 'COATING'),
(10, 'MOULDING');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `supplier_manufacturing_processes`
--
ALTER TABLE `supplier_manufacturing_processes`
  ADD CONSTRAINT `FKmw9wopla0lpflwpunut587gcm` FOREIGN KEY (`supplier_supplier_id`) REFERENCES `supplier` (`supplier_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
