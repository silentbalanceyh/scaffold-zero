#!/usr/bin/env bash
mvnd clean package install -DskipTests=true -Dmaven.javadoc.skip=true -Dmaven.source.skip=true -Dmaven.compile.fork=true -T 1C
# 自动化准备
cp -rf zo-inst/zo-dpma/target/inst-load.jar zo-app/app@jar/
# 自动化：菜单规划
cp -rf zo-inst/zo-menu/target/inst-menu.jar zo-app/app@jar/
chmod +x zo-app/app@jar/*.jar