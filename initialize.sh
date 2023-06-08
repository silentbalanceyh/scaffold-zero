#!/usr/bin/env bash
# 将MySQL设置成免密码操作
# 1. 先重建MySQL库
cd zo-module/zo-commerce
/usr/local/mysql/bin/mysql -u root -p -P 3306 -h 127.0.0.1  < script/database/database-reinit.sql
# 2. 执行初始化脚本
./init.db.sh
