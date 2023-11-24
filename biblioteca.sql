-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 18-11-2023 a las 02:14:46
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administracion`
--

DROP TABLE IF EXISTS `administracion`;
CREATE TABLE IF NOT EXISTS `administracion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dia_estudiante` int NOT NULL,
  `mora_estudiante` int NOT NULL,
  `material_estudiante` int NOT NULL,
  `dia_profesor` int NOT NULL,
  `mora_profesor` int NOT NULL DEFAULT '0',
  `material_profesor` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administracion`
--

INSERT INTO `administracion` (`id`, `dia_estudiante`, `mora_estudiante`, `material_estudiante`, `dia_profesor`, `mora_profesor`, `material_profesor`) VALUES
(1, 2, 10, 3, 3, 5, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

DROP TABLE IF EXISTS `materiales`;
CREATE TABLE IF NOT EXISTS `materiales` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cod_id` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `nombre_material` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `no_estante` int DEFAULT NULL,
  `tipo_material` varchar(100) DEFAULT NULL,
  `autor` varchar(100) DEFAULT NULL,
  `unidades` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materiales`
--

INSERT INTO `materiales` (`id`, `cod_id`, `nombre_material`, `no_estante`, `tipo_material`, `autor`, `unidades`) VALUES
(1, 'LIB123', 'EL PRINCIPITO', 1, 'LIBRO', 'ANTONIE DE SAINT-EXUPÉRY', 12),
(2, 'DVD234', 'AQUAMAN', 3, 'DVD', 'DC COMICS', 2),
(3, 'DVD333', 'SON COMO NIÑOS', 5, 'DVD', 'COLUMBIA PICTURES', 5),
(4, 'CD452', 'VEN PORQUE TE NECESITO', 8, 'CD', 'LOS TEMERARIOS', 3),
(5, 'REV845', 'LUGARES ASOMBROSOS', 5, 'REVISTA', 'LUISITO COMUNICA', 9),
(6, 'REV456', 'USO DE LAS TICS', 5, 'REVISTA', 'RAFAEL TORRES', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
CREATE TABLE IF NOT EXISTS `prestamos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_user` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `nombre_user` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `id_material` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `nombre_material` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `f_prestamo` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `f_devolucion` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`id`, `id_user`, `nombre_user`, `id_material`, `nombre_material`, `f_prestamo`, `f_devolucion`) VALUES
(5, 'QA222131', 'ELIAS', 'LIB123', 'EL PRINCIPITO', '2023/11/13', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `roles` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id`, `roles`) VALUES
(1, 'ESTUDIANTE'),
(2, 'PROFESOR'),
(3, 'ADMINISTRADOR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_material`
--

DROP TABLE IF EXISTS `tipo_material`;
CREATE TABLE IF NOT EXISTS `tipo_material` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo_material` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_material`
--

INSERT INTO `tipo_material` (`id`, `tipo_material`) VALUES
(1, 'LIBRO'),
(2, 'CD'),
(3, 'DVD'),
(4, 'REVISTA'),
(5, 'TESIS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_user` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `nombres` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  `oficio` varchar(100) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `recargo_mora` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `id_user`, `nombres`, `apellidos`, `oficio`, `username`, `password`, `recargo_mora`) VALUES
(1, 'RA223357', 'FERNANDO', 'RUIZ', 'ADMINISTRADOR', 'FERR007', 'SELECTA82', 0),
(2, 'GC223008', 'RICARDO', 'GARCIA', 'PROFESOR', 'RICKY', '123UDB', 0),
(3, 'DV223062', 'ALVARO', 'DIAZ', 'ESTUDIANTE', 'ALVARO845', 'ALVARO845', 0),
(4, 'LH222201', 'FREDY', 'LOPEZ', 'PROFESOR', 'FREDY2000', '8915A', 0),
(5, 'QA222131', 'ELIAS', 'QUIJANO', 'ESTUDIANTE', 'ELIAS2002', 'ELIAS007', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
