-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2023 at 06:51 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbmahasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbakun`
--

CREATE TABLE `tbakun` (
  `nim` varchar(10) NOT NULL,
  `password` text NOT NULL,
  `nama` text NOT NULL,
  `kelas` text NOT NULL,
  `status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbakun`
--

INSERT INTO `tbakun` (`nim`, `password`, `nama`, `kelas`, `status`) VALUES
('102023', 'dosen', 'dosen1', '-', 'Dosen'),
('112023', '123', 'dosen2', '-', 'Dosen'),
('122023', '123', 'dosen3', '-', 'Dosen'),
('2109106001', '001', 'Herni Suharti', 'Kelas A', 'Mahasiswa'),
('2109106002', '002', 'Alif Maulana Setyawan', 'Kelas A', 'Mahasiswa'),
('2109106003', '003', 'Bayu Abdurossyid', 'Kelas A', 'Mahasiswa'),
('2109106004', '004', 'Aziizah Oki Shofrina', 'Kelas A', 'Mahasiswa'),
('2109106008', '008', 'Chintia Liu Wintin', 'Kelas A', 'Mahasiswa'),
('2109106060', '060', 'Deby Ayu Syakhira', 'Kelas C', 'Mahasiswa'),
('2109106061', '123', 'Dinda Nur Afifah', 'Kelas B', 'Mahasiswa'),
('2109106062', '062', 'M. Julian Arfandy', 'Kelas B', 'Mahasiswa'),
('2109106063', '063', 'Zahra Salsabilla', 'Kelas B', 'Mahasiswa'),
('2109106064', '064', 'Daviana Dwitasari E.F', 'Kelas B', 'Mahasiswa'),
('2109106065', '065', 'Mahsa Jacinda Putri', 'Kelas B', 'Mahasiswa'),
('2109106066', '066', 'Moh. Ikhwan Wahyudi', 'Kelas C', 'Mahasiswa'),
('2109106067', '067', 'Jerry Fitriansyah', 'Kelas C', 'Mahasiswa'),
('2109106068', '068', 'M. Dhimas Eko', 'Kelas C', 'Mahasiswa'),
('2109106069', '069', 'M. Muchlis Abimanyu', 'Kelas C', 'Mahasiswa');

-- --------------------------------------------------------

--
-- Table structure for table `tbmatkul`
--

CREATE TABLE `tbmatkul` (
  `kode` int(10) NOT NULL,
  `nama` text NOT NULL,
  `sks` text NOT NULL,
  `praktikum` text NOT NULL,
  `kelas` text NOT NULL,
  `dosen` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbmatkul`
--

INSERT INTO `tbmatkul` (`kode`, `nama`, `sks`, `praktikum`, `kelas`, `dosen`) VALUES
(5, 'Algoritma Pemrograman Dasar', '3 SKS', 'Praktikum', 'Kelas A', 'Pak Bambang'),
(6, 'Algoritma Pemrograman Dasar', '3 SKS', 'Praktikum', 'Kelas B', 'Pak Bambang'),
(7, 'Algoritma Pemrograman Dasar', '3 SKS', 'Praktikum', 'Kelas C', 'Pak Bambang'),
(8, 'Rekayasa Perangkat Lunak', '4 SKS', 'Praktikum', 'Kelas A', 'Bu Ummul'),
(9, 'Rekayasa Perangkat Lunak', '4 SKS', 'Praktikum', 'Kelas B', 'Bu Heliza'),
(10, 'Rekayasa Perangkat Lunak', '4 SKS', 'Praktikum', 'Kelas C', 'Bu Heliza'),
(11, 'Bahasa Inggris 1', '2 SKS', 'Tidak', 'Kelas A', 'Bu Indah'),
(12, 'Bahasa Inggris 1', '2 SKS', 'Tidak', 'Kelas B', 'Bu Indah'),
(13, 'Bahasa Inggris 1', '2 SKS', 'Tidak', 'Kelas C', 'Bu Indah'),
(14, 'Sistem Digital', '3 SKS', 'Tidak', 'Kelas A', 'Pak Medi'),
(15, 'Sistem Digital', '3 SKS', 'Tidak', 'Kelas B', 'Pak Medi'),
(16, 'Sistem Digital', '3 SKS', 'Tidak', 'Kelas B', 'Pak Zainal'),
(17, 'Aljabar Linear', '3 SKS', 'Tidak', 'Kelas A', 'Bu Indah'),
(18, 'Aljabar Linear', '3 SKS', 'Tidak', 'Kelas B', 'Pak Fahrul'),
(19, 'Aljabar Linear', '3 SKS', 'Tidak', 'Kelas C', 'Pak Fahrul'),
(20, 'Framework', '3 SKS', 'Praktikum', 'Kelas Pilihan', 'Pak Awang'),
(21, 'Pemrograman Visual', '3 SKS', 'Praktikum', 'Kelas Pilihan', 'Pak Bambang');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbakun`
--
ALTER TABLE `tbakun`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tbmatkul`
--
ALTER TABLE `tbmatkul`
  ADD PRIMARY KEY (`kode`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbmatkul`
--
ALTER TABLE `tbmatkul`
  MODIFY `kode` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
