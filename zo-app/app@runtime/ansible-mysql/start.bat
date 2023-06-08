@echo OFF
mysql -u root -P 3306 -h ox.engine.cn  --get-server-public-key < init.account.sql
mysql -u root -P 3306 -h ox.engine.cn  --get-server-public-key < "%COMMON_PATH%"\app@runtime\@source\init.app-database.sql
mysql -u root -P 3306 -h ox.engine.cn  --get-server-public-key < "%COMMON_PATH%"\app@runtime\@source\init.workflow-engine.sql
mysql -u root -P 3306 -h ox.engine.cn  --get-server-public-key < init.database.sh
