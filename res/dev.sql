/*

 Target Server Type    : MariaDB
 Target Server Version : 101103 (10.11.3-MariaDB-1)
 File Encoding         : 65001

*/
USE nx_auto;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for app_customer
-- ----------------------------
DROP TABLE IF EXISTS `app_customer`;
CREATE TABLE `app_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of app_customer
-- ----------------------------
BEGIN;
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (1, '2020-02-17 17:54:07', '2022-08-29 00:57:03', 1, 'Jacob Zyrael', 'Somewhere', 'Austin');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (2, '2020-03-31 18:27:31', '2021-05-06 11:30:28', 1, 'Benjamin', '338 Fox Road', 'Dallas');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (3, '2020-06-04 12:46:15', '2022-12-29 17:31:49', 1, 'Leah', 'Rather Not Say', 'Austin');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (4, '2020-06-07 14:20:02', '2022-04-24 17:15:17', 2, 'Sugiyama', '5-2-19 Kikusui 3 Jo, Shiroishi Ward', 'Sapporo');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (5, '2020-05-13 03:22:09', '2021-07-04 22:38:52', 1, 'Phil', '299 Hinckley Rd', 'Leicester');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (6, '2020-03-15 03:30:20', '2022-10-05 20:17:59', 1, 'Christian', '668 Little Clarendon St', 'Oxford');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (7, '2020-07-09 11:30:43', '2022-11-30 09:14:30', 1, 'Fry', '542 West Market Street', 'Akron');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (8, '2020-03-29 20:54:54', '2022-11-06 05:52:15', 1, 'San Cheung', '55 2nd Zhongshan Road, Yuexiu District', 'Guangzhou');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (9, '2020-04-03 14:48:35', '2021-06-06 08:49:02', 1, 'Minamoto', '5-2-20 Kikusui 3 Jo, Shiroishi Ward', 'Sapporo');
INSERT INTO `app_customer` (`id`, `add_time`, `update_time`, `status`, `customer_name`, `address`, `city`) VALUES (10, '2020-02-04 09:36:42', '2022-12-12 07:49:30', 1, 'Abudul', '363 Aigburth Rd, Aigburth', 'Liverpool');
COMMIT;

-- ----------------------------
-- Table structure for app_shop
-- ----------------------------
DROP TABLE IF EXISTS `app_shop`;
CREATE TABLE `app_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of app_shop
-- ----------------------------
BEGIN;
INSERT INTO `app_shop` (`id`, `add_time`, `update_time`, `status`, `name`, `city`) VALUES (1, '2001-02-25 23:46:24', '2022-12-20 21:47:04', 1, 'Los Santos Customize', 'Dallas');
INSERT INTO `app_shop` (`id`, `add_time`, `update_time`, `status`, `name`, `city`) VALUES (2, '2015-02-04 07:00:06', '2022-01-31 05:13:48', 1, 'Men\'s Car Limited', 'Dallas');
INSERT INTO `app_shop` (`id`, `add_time`, `update_time`, `status`, `name`, `city`) VALUES (3, '2000-10-28 12:54:08', '2022-02-19 10:50:31', 1, 'Los Santos Customize', 'Austin');
INSERT INTO `app_shop` (`id`, `add_time`, `update_time`, `status`, `name`, `city`) VALUES (4, '2012-04-29 17:28:23', '2022-07-01 05:28:43', 1, 'Ueno Corporation', 'Austin');
INSERT INTO `app_shop` (`id`, `add_time`, `update_time`, `status`, `name`, `city`) VALUES (5, '2004-05-23 12:42:54', '2022-11-25 07:11:20', 1, 'Car Fox', 'Austin');
COMMIT;

-- ----------------------------
-- Table structure for sys_node
-- ----------------------------
DROP TABLE IF EXISTS `sys_node`;
CREATE TABLE `sys_node` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enabled` tinyint(1) DEFAULT NULL,
  `add_time` datetime DEFAULT current_timestamp(),
  `menu_name` varchar(255) DEFAULT 'MENU',
  `menu_type` int(11) DEFAULT NULL COMMENT '0-Menu,1-Menu_Item',
  `menu_order` int(11) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `parent_menu` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_node
-- ----------------------------
BEGIN;
INSERT INTO `sys_node` (`id`, `enabled`, `add_time`, `menu_name`, `menu_type`, `menu_order`, `url`, `parent_menu`) VALUES (1, 1, '2022-10-19 13:38:59', 'Dashboard', 1, 0, '/dashboard', NULL);
INSERT INTO `sys_node` (`id`, `enabled`, `add_time`, `menu_name`, `menu_type`, `menu_order`, `url`, `parent_menu`) VALUES (2, 1, '2022-10-19 13:39:34', 'Settings', 0, 1, '', NULL);
INSERT INTO `sys_node` (`id`, `enabled`, `add_time`, `menu_name`, `menu_type`, `menu_order`, `url`, `parent_menu`) VALUES (3, 1, '2022-10-19 13:40:14', 'Profile', 1, 2, '/settings/profile', 2);
INSERT INTO `sys_node` (`id`, `enabled`, `add_time`, `menu_name`, `menu_type`, `menu_order`, `url`, `parent_menu`) VALUES (4, 1, '2022-10-19 13:40:16', 'General', 1, 3, '/settings/general', 2);
INSERT INTO `sys_node` (`id`, `enabled`, `add_time`, `menu_name`, `menu_type`, `menu_order`, `url`, `parent_menu`) VALUES (5, 1, '2022-10-19 13:43:14', 'User Management', 1, 4, '/settings/users', 2);
COMMIT;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime DEFAULT current_timestamp(),
  `enabled` tinyint(1) DEFAULT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  `role_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_role` (`id`, `add_time`, `enabled`, `role_name`, `role_description`) VALUES (1, '2022-10-19 13:31:03', 1, 'ROLE_ADMIN', 'Administrator');
INSERT INTO `sys_role` (`id`, `add_time`, `enabled`, `role_name`, `role_description`) VALUES (2, '2022-10-19 13:31:07', 1, 'ROLE_USER', 'User');
INSERT INTO `sys_role` (`id`, `add_time`, `enabled`, `role_name`, `role_description`) VALUES (3, '2022-10-20 10:01:35', 1, 'ROLE_BACKUP', 'Backup User');
COMMIT;

-- ----------------------------
-- Table structure for sys_role_node
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_node`;
CREATE TABLE `sys_role_node` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mr_r_fk` (`role_id`),
  KEY `mr_m_fk` (`menu_id`),
  CONSTRAINT `mr_m_fk` FOREIGN KEY (`menu_id`) REFERENCES `sys_node` (`id`),
  CONSTRAINT `mr_r_fk` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_role_node
-- ----------------------------
BEGIN;
INSERT INTO `sys_role_node` (`id`, `role_id`, `menu_id`) VALUES (1, 1, 1);
INSERT INTO `sys_role_node` (`id`, `role_id`, `menu_id`) VALUES (2, 1, 2);
INSERT INTO `sys_role_node` (`id`, `role_id`, `menu_id`) VALUES (3, 1, 3);
INSERT INTO `sys_role_node` (`id`, `role_id`, `menu_id`) VALUES (4, 1, 4);
INSERT INTO `sys_role_node` (`id`, `role_id`, `menu_id`) VALUES (5, 1, 5);
INSERT INTO `sys_role_node` (`id`, `role_id`, `menu_id`) VALUES (6, 2, 1);
INSERT INTO `sys_role_node` (`id`, `role_id`, `menu_id`) VALUES (7, 2, 2);
INSERT INTO `sys_role_node` (`id`, `role_id`, `menu_id`) VALUES (8, 2, 3);
COMMIT;

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ur_r_fk` (`role_id`),
  KEY `ur_u_fk` (`user_id`),
  CONSTRAINT `ur_r_fk` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `ur_u_fk` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_role_user` (`id`, `role_id`, `user_id`) VALUES (1, 1, 1);
INSERT INTO `sys_role_user` (`id`, `role_id`, `user_id`) VALUES (2, 2, 2);
INSERT INTO `sys_role_user` (`id`, `role_id`, `user_id`) VALUES (3, 3, 1);
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime DEFAULT current_timestamp(),
  `update_time` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `cell_phone` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `github` varchar(255) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` (`id`, `add_time`, `update_time`, `status`, `username`, `password`, `email`, `cell_phone`, `avatar`, `github`, `role_id`) VALUES (1, '2022-10-19 15:11:07', NULL, 1, 'jacob', '$2a$10$ibNUcsDKNE6qJS8XXimynuBqwNduzwEvGYXKH/cMqbioCjeHgIzoK', 'jacob@example.com', NULL, NULL, NULL, NULL);
INSERT INTO `sys_user` (`id`, `add_time`, `update_time`, `status`, `username`, `password`, `email`, `cell_phone`, `avatar`, `github`, `role_id`) VALUES (2, '2022-10-19 15:31:01', NULL, 1, 'leah', '$2a$10$M9I0uhYItULtu7l3DR4.Tu5j/ViyWOsCv4rgzkp1QuupU1efN6dPK', 'leah@example.com', NULL, NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
