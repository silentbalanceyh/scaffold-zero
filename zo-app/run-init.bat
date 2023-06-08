call mvn install -DskipTests=true
  call mvn liquibase:update
