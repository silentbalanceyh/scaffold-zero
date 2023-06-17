#!/usr/bin/env bash
source ./run.env.sh

# 环境检查
if [ -z "$DB_TYPE" ];then
  echo "环境变量丢失，请设置：DB_TYPE ( TIDB | MYSQL )"
  exit 1
fi
mkdir -p ${PWD}/app@runtime/@source
mkdir -p ${PWD}/app@runtime/@atom
echo "数据库类型：$DB_TYPE"
export PATH_SOURCE=${PWD}/app@runtime/@source

# shellcheck disable=SC2188
<<ENV
DB_TYPE                 = （远程）数据库类型
DB_PASSWORD             = （远程） zero 账号的密码
PATH_SOURCE             = （本地）数据库初始化目录
PATH_RUN                = （本地）执行环境目录
ENV
# 初始化数据库
if [ "MYSQL" == "$DB_TYPE" ]; then
  export PATH_RUN=${PWD}/app@runtime/ansible-mysql
  # 执行MySQL Playbook
  ./app@runtime/ansible-mysql/start.sh
elif [ "TIDB" == "$DB_TYPE" ]; then
  export PATH_RUN=${PWD}/app@runtime/ansible-tidb
  # 执行TiDB Playbook
  ./app@runtime/ansible-mysql/start.sh
fi

# 「开发环境」本地执行部分
# shellcheck disable=SC2188
<<DEV
开发和生产分流的部分，在开发环境中，远程数据库 = 本地数据库

「开发」接下来直接执行：
1）mvn -> liquibase 生成数据库
2）iac-load -> 导入数据

「生产」
将上述两个步骤的SQL导出到 app@runtime/@source，执行 app@runtime 下的新的 Ansible Playbook
DEV
if [ "DEV" == "$DB_ENV" ]; then
  # 执行 liquibase
  mvn install -DskipTests=true
  mvn liquibase:update
  echo "03.数据库初始化完成/End"
  # 拷贝脚本 app@jar -> target
  cp -rf ./app@jar/*.jar ./target/
  chmod +x ./target/*.jar
  echo "04.执行数据导入/Start"
  # 注意此处运行必须是生产级
  java -jar target/inst-load.jar
  echo "05.数据导入完成/End"
  if [ -z "$DB_ATOM" ]; then
    echo "06.未开启动态建模！结束。"
  else
    echo "06.动态建模/Start"
    # 拷贝数据到输入目录
    mkdir -p ${PWD}/app@runtime/@atom/${DB_ATOM}/meta
    mkdir -p ${PWD}/app@runtime/@atom/${DB_ATOM}/model
    mkdir -p ${PWD}/app@runtime/@atom/${DB_ATOM}/schema
    cp -rf src/main/resources/atom/${DB_ATOM}/meta/* ${PWD}/app@runtime/@atom/${DB_ATOM}/meta
    java -jar target/inst-atom.jar cmdb ${PWD}
    echo "06.动态建模/End"
  fi
  # 菜单规划器
  echo "07.菜单规划/Start"
  java -jar target/inst-menu.jar
  echo "07.菜单规划/End"
elif [ "PROD" == "$DB_ENV" ]; then
  mysql -u zero -P 3306 -p "$DB_PASSWORD" -h "$DB_HOST"  DB_HOST  < ${PWD}/app@runtime/@backup/DB_HOTEL.sql
  mysql -u zero -P 3306 -p "$DB_PASSWORD" -h "$DB_HOST"  DB_HOTEL_WF  < ${PWD}/app@runtime/@backup/DB_HOTEL_WF.sql
  echo "数据库导入完成"
fi
echo "Successfully! 您的数据库已全部初始化完成，现在您可以启动Zero容器了!!!"
