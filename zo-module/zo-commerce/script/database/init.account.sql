CREATE USER IF NOT EXISTS 'zero'@'%' IDENTIFIED BY 'xxxxxxijn123';
GRANT ALL PRIVILEGES ON *.* TO 'zero'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;