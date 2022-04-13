#!/usr/bin/env bash
# 将MySQL设置成免密码操作
# 1. 先重建MySQL库
mysql -u root -P 3306 -h 127.0.0.1  < script/database/database-reinit.sql
# 2. 进入目录执行初始化脚本
cd tm-driver/ix-evolution
./run-init.sh
