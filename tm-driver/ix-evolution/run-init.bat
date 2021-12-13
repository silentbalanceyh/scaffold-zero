call mvn install -DskipTests=true
call mvn liquibase:update
echo "数据库初始化完成！"
