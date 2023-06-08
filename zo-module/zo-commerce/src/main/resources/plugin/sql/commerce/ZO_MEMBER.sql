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

 Date: 16/08/2019 17:42:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ZO_MEMBER
-- ----------------------------

-- changeset Lang:zo-member-1
DROP TABLE IF EXISTS `ZO_MEMBER`;
CREATE TABLE `ZO_MEMBER`
(
    -- 主键
    `PK_ID`           varchar(36) COLLATE utf8mb4_bin NOT NULL COMMENT 'uniqueId,PK_ID',

    -- 会员积分
    `R_IDENTITY_ID`   VARCHAR(36) COMMENT '「identityId」- 关联档案',
    `R_COMPANY_ID`    VARCHAR(36) COMMENT '「companyId」- 所属公司',
    `R_CARD_ID`       VARCHAR(36) COMMENT '「cardId」- 绑定卡',

    -- 会员编号
    `L_POINT`         bigint(20)                       DEFAULT NULL COMMENT '积分,point,L_POINT',
    `S_PROPOSER`      varchar(32) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT '推荐人,proposer,S_PROPOSER',
    `S_CODE`          varchar(36) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT '会员编号,code,S_CODE',
    `RLT_MBER_LEVEL`  varchar(36) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT '会员等级,level,RLT_MBER_LEVEL',
    `RLT_MBER_STATUS` varchar(36) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT '会员状态,status,RLT_MBER_STATUS',

    -- 关联信息
    `S_LICENSE_NUM`   varchar(16) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT '驾驶证,licenseNumber,S_LICENSE_NUM',
    `S_MOBILE`        varchar(20) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT '手机号,mobile,S_MOBILE',
    `S_NICKNAME`      varchar(64) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT '昵称,nickname,S_NICKNAME',
    `S_PHOTO`         varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '头像,photo,S_PHOTO',
    `S_REALNAME`      varchar(64) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT '姓名,realname,S_REALNAME',
    `D_BIRTHDAY`      datetime                         DEFAULT NULL COMMENT '生日,birthday,D_BIRTHDAY',
    `IS_MALE`         BIT                       DEFAULT NULL COMMENT '男？true为男，false为女,male,IS_MALE',

    -- 统一字段信息
    `J_CONFIG`        text COLLATE utf8mb4_bin COMMENT 'config,J_CONFIG',
    `IS_ACTIVE`       BIT                       DEFAULT NULL COMMENT 'active,IS_ACTIVE',
    `Z_SIGMA`         varchar(32) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT 'sigma,Z_SIGMA',
    `Z_LANGUAGE`      varchar(8) COLLATE utf8mb4_bin   DEFAULT NULL COMMENT 'language,Z_LANGUAGE',
    `Z_CREATE_BY`     varchar(36) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT 'createBy,Z_CREATE_BY',
    `Z_CREATE_TIME`   datetime                         DEFAULT NULL COMMENT 'createTime,Z_CREATE_TIME',
    `Z_UPDATE_BY`     varchar(36) COLLATE utf8mb4_bin  DEFAULT NULL COMMENT 'updateBy,Z_UPDATE_BY',
    `Z_UPDATE_TIME`   datetime                         DEFAULT NULL COMMENT 'updateTime,Z_UPDATE_TIME',
    PRIMARY KEY (`PK_ID`),
    UNIQUE KEY `UK_ZO_MEMBER_S_MOBILE_Z_SIGMA` (`S_MOBILE`, `Z_SIGMA`),
    UNIQUE KEY `UK_ZO_MEMBER_S_CODE_Z_SIGMA` (`S_CODE`, `Z_SIGMA`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
