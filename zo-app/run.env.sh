#!/usr/bin/env bash
# 设置数据库类型（根据数据库类型执行不同流程）
# - 1) 现阶段脚本类型只支持 TIDB 和 MYSQL
# - 2) 远程机中已经部署了 mvn / java / mysql 三种命令
# - 3) 远程机中 non-shell 的环境变量已和 shell 登录模式保持了一致
#      检查远程环境中的 ~/.bashrc 中是否已包含了 mvn / java / mysql 三个命令的基础环境变量
# - 4) 默认数据库账号使用 zero，此处 DB_PASSWORD 对应的是 zero 的密码
# - 5) 默认 DB_ENV = DEV（开发测试环境）
# - 6) DB_ATOM开启动态建模部分
# - 7）Z_HED_ENABLED是否打开加密模块（默认关闭）
# TIDB / MYSQL
export DB_TYPE=MYSQL
export DB_PASSWORD=pl,okmijn123
export DB_ENV=DEV
export DB_ATOM=
export Z_HED_ENABLED=true