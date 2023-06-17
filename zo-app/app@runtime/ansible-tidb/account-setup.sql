create user 'zero'@'%' identified by 'xxxxxxxxx123';
GRANT ALL PRIVILEGES ON DB_SCAFFOLD.* TO 'zero'@'%';
GRANT ALL PRIVILEGES ON DB_SCAFFOLD_WF.* TO 'zero'@'%';
FLUSH PRIVILEGES;