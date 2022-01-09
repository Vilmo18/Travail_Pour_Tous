-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : Dim 09 jan. 2022 à 14:26
-- Version du serveur :  8.0.21
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `netbeans`
--

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `nom_utilisateur` varchar(25) NOT NULL,
  `password` varchar(255) NOT NULL,
  `date_naiss` date NOT NULL,
  `dernier_diplo` varchar(255) NOT NULL,
  `serie` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `filiere` varchar(255) NOT NULL,
  `e_mail` varchar(25) DEFAULT NULL,
  `telephone` int DEFAULT NULL,
  `profession` varchar(255) DEFAULT NULL,
  `quartier` varchar(255) DEFAULT NULL,
  `domaine` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nom_utilisateur`),
  UNIQUE KEY `e_mail` (`e_mail`),
  UNIQUE KEY `contact` (`telephone`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`nom`, `prenom`, `nom_utilisateur`, `password`, `date_naiss`, `dernier_diplo`, `serie`, `filiere`, `e_mail`, `telephone`, `profession`, `quartier`, `domaine`) VALUES
('nzadouo', 'franck', 'fand', 'az', '2022-01-14', 'Baccalaureat', '', 'C', 'nza@gmail.com', 656244747, '', '', 'Informatique');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
