#!/usr/bin/env bash
/usr/local/mysql/bin/mysqldump -u root -ppl,okmijn123 -h localhost --databases DB_QIANLI > DB_QIANLI.sql
echo "[OX] 数据库备份成功!";