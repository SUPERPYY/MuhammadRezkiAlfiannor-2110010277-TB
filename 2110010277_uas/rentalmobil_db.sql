-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jan 2024 pada 13.51
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmobil_db`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `db_mobil`
--

CREATE TABLE `db_mobil` (
  `id_mobil` int(11) NOT NULL,
  `nama_mobil` varchar(30) NOT NULL,
  `merek_mobil` varchar(30) NOT NULL,
  `harga_sewa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `db_mobil`
--

INSERT INTO `db_mobil` (`id_mobil`, `nama_mobil`, `merek_mobil`, `harga_sewa`) VALUES
(1, 'brio', 'honda', '10000000'),
(2, 'avanza', 'toyota', '2000000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `db_penyewa`
--

CREATE TABLE `db_penyewa` (
  `id_penyewa` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `db_penyewa`
--

INSERT INTO `db_penyewa` (`id_penyewa`, `nama`, `no_hp`, `alamat`) VALUES
(124, 'udin', '08237738288', 'banjarbaru'),
(123, 'alex', '08237738288', 'banjarbaru'),
(127, 'bagas', '08236472847', 'kandangan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `db_transaksi`
--

CREATE TABLE `db_transaksi` (
  `id_penyewa` int(11) NOT NULL,
  `nama_penyewa` varchar(30) NOT NULL,
  `id_mobil` int(11) NOT NULL,
  `tanggal_pinjam` varchar(30) NOT NULL,
  `tanggal_kembali` varchar(30) NOT NULL,
  `harga` varchar(100) NOT NULL,
  `lama` varchar(30) NOT NULL,
  `total` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `db_transaksi`
--

INSERT INTO `db_transaksi` (`id_penyewa`, `nama_penyewa`, `id_mobil`, `tanggal_pinjam`, `tanggal_kembali`, `harga`, `lama`, `total`) VALUES
(1, 'adi', 1, '01-01-2024', '02-01-2024', '900000', '3', '2700000.0'),
(2, 'abi', 2, '02-01-2024', '05-01-2024', '200000', '3', '600000.0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
