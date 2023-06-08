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

 Date: 18/11/2019 06:15:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ZO_CARD
-- ----------------------------
-- changeset Lang:zo-card-1
DROP TABLE IF EXISTS `ZO_CARD`;
CREATE TABLE `ZO_CARD`
(
    -- 主键
    `PK_ID`          varchar(36) COLLATE utf8mb4_bin NOT NULL COMMENT 'uniqueId,PK_ID',
    `D_AMOUNT`       decimal(10, 2)                  NOT NULL COMMENT '卡余额,amount,D_AMOUNT',
    `D_EXPIRED_TIME` datetime                        DEFAULT NULL COMMENT '过期时间,expiredTime,D_EXPIRED_TIME',
    `L_POINT`        bigint(20)                      DEFAULT NULL COMMENT '积分,point,L_POINT',
    `S_CODE`         varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '编号,code,S_CODE',
    `S_BATCH`        varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '批次,batch,S_BATCH',
    `S_NUMBER`       varchar(64) COLLATE utf8mb4_bin NOT NULL COMMENT '卡号,number,S_NUMBER',
    `RLT_CARD_TYPE`  varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '类型,cardType,RLT_CARD_TYPE',

    -- 是否主卡
    `IS_MAJOR`       BIT                      DEFAULT NULL COMMENT '主卡,major,IS_MAJOR',

    -- 统一信息
    `J_CONFIG`       text COLLATE utf8mb4_bin COMMENT 'config,J_CONFIG',
    `IS_ACTIVE`      BIT                      DEFAULT NULL COMMENT 'active,IS_ACTIVE',
    `Z_SIGMA`        varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'sigma,Z_SIGMA',
    `Z_LANGUAGE`     varchar(8) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT 'language,Z_LANGUAGE',
    `Z_CREATE_BY`    varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'createBy,Z_CREATE_BY',
    `Z_CREATE_TIME`  datetime                        DEFAULT NULL COMMENT 'createTime,Z_CREATE_TIME',
    `Z_UPDATE_BY`    varchar(36) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'updateBy,Z_UPDATE_BY',
    `Z_UPDATE_TIME`  datetime                        DEFAULT NULL COMMENT 'updateTime,Z_UPDATE_TIME',
    PRIMARY KEY (`PK_ID`),
    UNIQUE KEY `UK_ZO_CARD_S_NUMBER_Z_SIGMA` (`S_NUMBER`, `Z_SIGMA`),
    UNIQUE KEY `UK_ZO_CARD_S_CODE_Z_SIGMA` (`S_CODE`, `Z_SIGMA`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
