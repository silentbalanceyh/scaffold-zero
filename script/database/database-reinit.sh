#!/usr/bin/env bash
/usr/local/mysql/bin/mysql -u root -P 3306 -h 127.0.0.1  < database-reinit.sql
/usr/local/mysql/bin/mysql -u root -P 3306 -h 127.0.0.1  < workflow-engine.sql
echo "[OX] 重建数据库成功!";