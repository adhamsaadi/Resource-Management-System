-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 22, 2023 at 10:42 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db`
--

-- --------------------------------------------------------

--
-- Table structure for table `animalinfo`
--

CREATE TABLE `animalinfo` (
  `animalid` int(11) NOT NULL,
  `animalname` varchar(45) DEFAULT NULL,
  `animalclass` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `animalinfo`
--

INSERT INTO `animalinfo` (`animalid`, `animalname`, `animalclass`) VALUES
(1, 'Cat', 'Mammalia');

-- --------------------------------------------------------

--
-- Table structure for table `landinfo`
--

CREATE TABLE `landinfo` (
  `landid` int(11) NOT NULL,
  `landname` varchar(45) DEFAULT NULL,
  `landtype` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `landinfo`
--

INSERT INTO `landinfo` (`landid`, `landname`, `landtype`) VALUES
(1, 'The Indian Himalayan', 'Mountain');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `sn` int(11) NOT NULL,
  `id` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`sn`, `id`, `pass`) VALUES
(1, 'adham', 'adham');

-- --------------------------------------------------------

--
-- Table structure for table `personalinfo`
--

CREATE TABLE `personalinfo` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `race` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `personalinfo`
--

INSERT INTO `personalinfo` (`id`, `name`, `phone`, `race`, `dob`, `email`, `address`) VALUES
(1, 'Adham Saadi', '09xx xxx xxxx', 'Arab', '16 / May / 1995', 'Adham-95@windowslive.com', 'Palestine, Akka');

-- --------------------------------------------------------

--
-- Table structure for table `plantinfo`
--

CREATE TABLE `plantinfo` (
  `plantid` int(11) NOT NULL,
  `plantname` varchar(45) DEFAULT NULL,
  `plantclass` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `plantinfo`
--

INSERT INTO `plantinfo` (`plantid`, `plantname`, `plantclass`) VALUES
(1, 'Avocado', 'Lauraceae');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `animalinfo`
--
ALTER TABLE `animalinfo`
  ADD PRIMARY KEY (`animalid`);

--
-- Indexes for table `landinfo`
--
ALTER TABLE `landinfo`
  ADD PRIMARY KEY (`landid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`sn`);

--
-- Indexes for table `personalinfo`
--
ALTER TABLE `personalinfo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `plantinfo`
--
ALTER TABLE `plantinfo`
  ADD PRIMARY KEY (`plantid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
