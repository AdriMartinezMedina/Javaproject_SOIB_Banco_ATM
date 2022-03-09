-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-03-2022 a las 10:52:27
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
(20, 'Pepona', 'Pepa', '1992-12-12', 'X12312312', 'Calle Colon', 'Manacor', 'trans', 'trans', '2022-02-11 13:15:27'),
(37, 'hola', 'hola', '1992-12-12', 'X6325454B', 'erger', '325', 'hola', '99800b85d3383e3a2fb45eb7d0066a4879a9dad0', '2022-03-09 09:30:08');

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
(4, 'ES333333333333333333', -125.01000000000005, 20),
(11, 'ES5073296620449579748743', -248.78000000000003, 37);

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

--
-- Volcado de datos para la tabla `tarjetas`
--

INSERT INTO `tarjetas` (`id`, `numero_tarjeta`, `fecha_caducidad`, `cvv`, `id_cuenta_corriente`) VALUES
(33, 4390, '2027-03-09', 419, 4);

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
-- Volcado de datos para la tabla `transacciones`
--

INSERT INTO `transacciones` (`id`, `tipo_transaccion`, `cantidad_transaccion`, `id_tarjeta`, `id_cuenta_corriente`, `id_cliente`) VALUES
(27, 0, 23, NULL, 4, 20),
(33, 0, 67, NULL, 9, 35),
(34, 1, 12, NULL, 9, 35),
(35, 0, 34, NULL, 4, 20),
(36, 1, 34, NULL, 4, 20),
(37, 0, 120, NULL, 4, 20),
(38, 0, 130, NULL, 4, 20),
(39, 0, 12, NULL, 4, 20),
(40, 0, 190, NULL, 4, 20),
(41, 0, 234, NULL, 4, 20),
(42, 0, 1234, NULL, 4, 20),
(43, 0, 234, NULL, 4, 20),
(44, 0, 12321, NULL, 4, 20),
(45, 0, 123, NULL, 4, 20),
(46, 0, 120, NULL, 4, 20),
(47, 1, 10000, NULL, 4, 20),
(48, 0, 20000, NULL, 4, 20),
(49, 1, 34.34, NULL, 4, 20),
(50, 1, 12.12, NULL, 4, 20),
(51, 1, 2751, NULL, 4, 20),
(52, 1, 0.5, NULL, 4, 20),
(53, 1, 12.3, NULL, 4, 20),
(54, 1, 12.32, NULL, 4, 20),
(55, 1, 123.43, NULL, 4, 20),
(56, 1, -23, NULL, 4, 20),
(57, 0, 120.4, NULL, 11, 37),
(58, 0, 50, NULL, 11, 37),
(59, 1, 50.2, NULL, 11, 37),
(60, 1, 345, NULL, 11, 37),
(61, 1, 23.3, NULL, 11, 37),
(62, 1, 0.34, NULL, 11, 37),
(63, 1, 0.34, NULL, 11, 37);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT de la tabla `conexiones`
--
ALTER TABLE `conexiones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cuentas_corrientes`
--
ALTER TABLE `cuentas_corrientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `tarjetas`
--
ALTER TABLE `tarjetas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `transacciones`
--
ALTER TABLE `transacciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

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
