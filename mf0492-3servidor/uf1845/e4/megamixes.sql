-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-08-2019 a las 12:49:26
-- Versión del servidor: 10.3.15-MariaDB
-- Versión de PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `discomix`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `megamixes`
--

CREATE TABLE `megamixes` (
  `idmegamixes` int(11) NOT NULL,
  `album` varchar(45) NOT NULL,
  `discografica` varchar(45) NOT NULL,
  `discjockey` varchar(25) NOT NULL,
  `valoracion` double NOT NULL,
  `estilo` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `megamixes`
--

INSERT INTO `megamixes` (`idmegamixes`, `album`, `discografica`, `discjockey`, `valoracion`, `estilo`) VALUES
(1, 'mmmmm', 'Max Music', 'Mike Platinas', 10, 'Italo'),
(2, 'Bolero Mix ', 'Blanco y Negro', 'Rául Orellana', 10, 'Italo'),
(4, 'Bolero Mix11', 'Blanco y Negro', 'Rául Orellana', 9, 'Dance'),
(5, 'Energy For You', 'Max Music', 'Mike Platinas', 9, 'Dance'),
(7, 'hhhhhhh', 'hhhhhhhh', 'Mike Platinas', 10, 'Italo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `megamixes`
--
ALTER TABLE `megamixes`
  ADD PRIMARY KEY (`idmegamixes`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `megamixes`
--
ALTER TABLE `megamixes`
  MODIFY `idmegamixes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
