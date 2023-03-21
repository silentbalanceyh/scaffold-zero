-- liquibase formatted sql

/*
 Navicat Premium Data Transfer

 Source Server         : DB - MySQL
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : DB_SCAFFOLD

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 21/03/2023 17:52:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ZO_ROOM
-- ----------------------------

-- changeset Lang:zo-room-1
DROP TABLE IF EXISTS `ZO_ROOM`;
CREATE TABLE `ZO_ROOM`
(
    `PK_ID`          varchar(36) COLLATE utf8mb4_bin NOT NULL COMMENT 'uniqueId,PK_ID',
    `T_ROOMATTRS`    text COLLATE utf8mb4_bin COMMENT 'attrs,T_ROOMATTRS',
    `S_CODE`         varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'code,S_CODE',
    `S_ROOM_NUM`     varchar(16) COLLATE utf8mb4_bin NOT NULL COMMENT 'number,S_ROOM_NUM',
    `J_CONFIG`       text COLLATE utf8mb4_bin COMMENT 'config,J_CONFIG',
    `J_FEATURES`     text COLLATE utf8mb4_bin COMMENT 'features,J_FEATURES',
    `R_FLOOR_ID`     varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'floor,R_FLOOR_ID',
    `R_HOTEL_ID`     varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'hotelId,R_HOTEL_ID',
    `R_ROOM_TYPE_ID` varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'roomTypeId,R_ROOM_TYPE_ID',
    `R_TENT_ID`      varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'tent,R_TENT_ID',
    `IS_ACTIVE`      BIT                             DEFAULT NULL COMMENT 'active,IS_ACTIVE',
    `Z_SIGMA`        varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'sigma,Z_SIGMA',
    `Z_LANGUAGE`     varchar(8) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT 'language,Z_LANGUAGE',
    `Z_CREATE_BY`    varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'createBy,Z_CREATE_BY',
    `Z_CREATE_TIME`  datetime                        DEFAULT NULL COMMENT 'createTime,Z_CREATE_TIME',
    `Z_UPDATE_BY`    varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'updateBy,Z_UPDATE_BY',
    `Z_UPDATE_TIME`  datetime                        DEFAULT NULL COMMENT 'updateTime,Z_UPDATE_TIME',
    PRIMARY KEY (`PK_ID`),
    UNIQUE KEY `UK_ZO_ROOM_S_CODE_Z_SIGMA` (`S_CODE`, `Z_SIGMA`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
