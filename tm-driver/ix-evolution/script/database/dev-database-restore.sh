#!/usr/bin/env bash
/usr/local/mysql/bin/mysql -u root -P 3306 -h 127.0.0.1  < DB_QIANLI.sql
echo "[OX] 数据库还原成功!";