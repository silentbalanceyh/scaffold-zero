#!/usr/bin/env bash

# Linux Shell: non-shell -> shell
if [ -f "./.bash_profile" ]; then
  source "./.bash_profile"
fi

# Non Linux Shell: non-shell -> shell
if [ -f "./.bashrc" ]; then
  source "./.bashrc"
fi

# MySQL 账号设置
# 1. Account
/usr/local/mysql/bin/mysql -uzero -p"$DB_PASSWORD" -h"$DB_HOST" < "$DB_RUN"/init.account.sql
# 2. Database
/usr/local/mysql/bin/mysql -uzero -p"$DB_PASSWORD" -h"$DB_HOST" < "$DB_RUN"/init.app-database.sql
# 3. Database Workflow
/usr/local/mysql/bin/mysql -uzero -p"$DB_PASSWORD" -h"$DB_HOST" < "$DB_RUN"/init.workflow-engine.sql