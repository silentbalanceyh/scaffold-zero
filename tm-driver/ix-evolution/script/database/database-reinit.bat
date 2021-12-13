mysql -u root -P 3306 -h 127.0.0.1 -p < database-reinit.sql
mysql -u root -P 3306 -h 127.0.0.1 -p < workflow-engine.sql
echo "[OX] 重建数据库成功!";