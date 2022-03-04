-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-02-2022 a las 10:19:09
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `atm`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `f_nacimiento` date NOT NULL,
  `dni` varchar(9) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `poblacion` varchar(100) NOT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `contrasena` varchar(100) DEFAULT NULL,
  `f_cr` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `nombre`, `apellidos`, `f_nacimiento`, `dni`, `direccion`, `poblacion`, `usuario`, `contrasena`, `f_cr`) VALUES
(6, 'yuijo', 'uio', '1998-12-05', 'uijok', 'guyi', 'vubin', 'hola', 'hola', '2022-02-09 10:12:56'),
(8, 'hgjk', 'hbjnkl', '1999-01-01', 'jkml', 'ui', 'uinjmo', 'hbnj', '4d186321c1a7f0f354b297e8914ab240', '2022-02-04 13:29:23'),
(9, 'Fran', 'Duque', '1963-01-13', '3043535X', 'calle del sol', '07020', 'fran@casa.com', 'pepona', '2022-02-04 13:29:23'),
(10, 'uhijokp', 'uijokp', '1998-12-12', 'uijok', 'ubyijo', '08734', 'hoola', 'hoola', '2022-02-09 10:22:56'),
(11, 'uhijokp', 'uijokp', '1998-12-12', 'uijok', 'ubyijo', '08734', 'hoola', 'hoola', '2022-02-09 10:22:56'),
(12, 'yguhimo', 'hbnjmk', '1998-12-12', 'uiokp', 'binomk', '98776', 'hoooola', 'hola', '2022-02-09 10:24:44'),
(13, 'yguhimo', 'hbnjmk', '1998-12-12', 'uiokp', 'binomk', '98776', 'hoooola', 'hola', '2022-02-09 10:24:44'),
(14, 'uhjoikp', 'uijokpl', '1998-01-12', 'uijokpl', 'niomkl,', '8790', 'iojlk,', 'bnjmlk', '2022-02-09 10:25:56'),
(15, 'uhjoikp', 'uijokpl', '1998-01-12', 'uijokpl', 'niomkl,', '8790', 'iojlk,', 'bnjmlk', '2022-02-09 10:25:56'),
(16, 'bnjmkl', 'jnkml', '1998-12-12', 'bhjkml', 'buink', '7689', 'bhjnmlk', 'hbjkml', '2022-02-09 10:27:06'),
(17, 'bnjmkl', 'jnkml', '1998-12-12', 'bhjkml', 'buink', '7689', 'bhjnmlk', 'hbjkml', '2022-02-09 10:27:06'),
(18, 'jiokp', 'njmk', '1991-12-12', 'njkml,', 'njkl', 'njkml', 'njkml', 'kjmlñ', '2022-02-09 10:27:59'),
(19, 'jiokp', 'njmk', '1991-12-12', 'njkml,', 'njkl', 'njkml', 'njkml', 'kjmlñ', '2022-02-09 10:27:59'),
(20, 'njjmkl', 'jnkml', '1992-12-12', 'njmlk,ñ', 'buikl', 'njkml', 'njmlk', 'kjmlñ', '2022-02-09 10:28:56'),
(21, 'njjmkl', 'jnkml', '1992-12-12', 'njmlk,ñ', 'buikl', 'njkml', 'njmlk', 'kjmlñ', '2022-02-09 10:28:56'),
(22, 'bnjk', 'njkl', '1991-12-12', 'jnkml', 'mkl', 'kml', 'kml', 'kml,ñ', '2022-02-09 10:31:04'),
(23, 'bnjk', 'njkl', '1991-12-12', 'jnkml', 'mkl', 'kml', 'kml', 'kml,ñ', '2022-02-09 10:31:04'),
(24, 'Ibra ', 'Alhamuti', '1992-12-12', '43234234', 'arta', '07694', 'ibra', 'ibra', '2022-02-09 10:44:33'),
(25, 'Ibra ', 'Alhamuti', '1992-12-12', '43234234', 'arta', '07694', 'ibra', 'ibra', '2022-02-09 10:44:33'),
(26, 'Ibra ', 'Alhamuti', '1992-12-12', '43234234', 'arta', '07694', 'ibra', 'ibra', '2022-02-09 10:44:48'),
(27, 'Ibra ', 'Alhamuti', '1992-12-12', '43234234', 'arta', '07694', 'ibra', 'ibra', '2022-02-09 10:44:48'),
(28, 'Ibra ', 'Alhamuti', '1992-12-12', '43234234', 'arta', '07694', 'ibra', 'ibra', '2022-02-09 10:44:50'),
(29, 'Ibra ', 'Alhamuti', '1992-12-12', '43234234', 'arta', '07694', 'ibra', 'ibra', '2022-02-09 10:44:50'),
(30, 'hbjnkm', 'jnhkml', '1991-12-12', 'jnkml', 'uiok', 'nimo', 'nijmok', 'jnimk', '2022-02-09 10:46:17');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conexiones`
--

CREATE TABLE `conexiones` (
  `id` int(11) NOT NULL,
  `f_hora` timestamp NULL DEFAULT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas_corrientes`
--

CREATE TABLE `cuentas_corrientes` (
  `id` int(11) NOT NULL,
  `iban` varchar(24) NOT NULL,
  `balance` double NOT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentas_corrientes`
--

INSERT INTO `cuentas_corrientes` (`id`, `iban`, `balance`, `id_cliente`) VALUES
(4, 'ES333333333333333333', 0, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjetas`
--

CREATE TABLE `tarjetas` (
  `id` int(11) NOT NULL,
  `numero_tarjeta` int(16) NOT NULL,
  `fecha_caducidad` date NOT NULL,
  `cvv` int(3) NOT NULL,
  `id_cuenta_corriente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transacciones`
--

CREATE TABLE `transacciones` (
  `id` int(11) NOT NULL,
  `tipo_transaccion` tinyint(1) NOT NULL COMMENT '0 sacar, 1 meter dinero',
  `cantidad_transaccion` double NOT NULL,
  `id_tarjeta` int(11) DEFAULT NULL,
  `id_cuenta_corriente` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `conexiones`
--
ALTER TABLE `conexiones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_conexiones_clientes1_idx` (`id_cliente`);

--
-- Indices de la tabla `cuentas_corrientes`
--
ALTER TABLE `cuentas_corrientes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_cuentas_corrientes_clientes_idx` (`id_cliente`);

--
-- Indices de la tabla `tarjetas`
--
ALTER TABLE `tarjetas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_tarjetas_cuentas_corrientes1_idx` (`id_cuenta_corriente`);

--
-- Indices de la tabla `transacciones`
--
ALTER TABLE `transacciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_transacciones_tarjetas1_idx` (`id_tarjeta`),
  ADD KEY `fk_transacciones_cuentas_corrientes1_idx` (`id_cuenta_corriente`),
  ADD KEY `fk_conexiones_clientes2_idx` (`id_cliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `conexiones`
--
ALTER TABLE `conexiones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cuentas_corrientes`
--
ALTER TABLE `cuentas_corrientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tarjetas`
--
ALTER TABLE `tarjetas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `transacciones`
--
ALTER TABLE `transacciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `conexiones`
--
ALTER TABLE `conexiones`
  ADD CONSTRAINT `fk_conexiones_clientes1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `cuentas_corrientes`
--
ALTER TABLE `cuentas_corrientes`
  ADD CONSTRAINT `fk_cuentas_corrientes_clientes` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tarjetas`
--
ALTER TABLE `tarjetas`
  ADD CONSTRAINT `fk_tarjetas_cuentas_corrientes1` FOREIGN KEY (`id_cuenta_corriente`) REFERENCES `cuentas_corrientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `transacciones`
--
ALTER TABLE `transacciones`
  ADD CONSTRAINT `fk_conexiones_clientes2` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_transacciones_cuentas_corrientes1` FOREIGN KEY (`id_cuenta_corriente`) REFERENCES `cuentas_corrientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_transacciones_tarjetas1` FOREIGN KEY (`id_tarjeta`) REFERENCES `tarjetas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
