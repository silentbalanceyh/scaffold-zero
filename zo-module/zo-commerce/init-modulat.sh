#!/usr/bin/env bash
export ZERO_ROOT_MENU=script/@configuration/menu
export ZERO_ROOT_MOD=script/@configuration/modulat
export ZERO_REST_OOB=src/main/resources

echo "=============== Start"
echo "zo-commerce模块化执行"

mkdir -p src/main/resources/plugin/commerce/oob/modulat/
mkdir -p src/main/resources/plugin/commerce/oob/menu/
rm -rf src/main/resources/plugin/commerce/oob/modulat/*
rm -rf src/main/resources/plugin/commerce/oob/menu/*
cp -rf script/@configuration/menu/* src/main/resources/plugin/commerce/oob/menu/
cp -rf script/@configuration/modulat/* src/main/resources/plugin/commerce/oob/modulat/
echo "zo-commerce模块/菜单配置 拷贝完成"
aj jmod -p src/main/resources/plugin/commerce/oob
echo "zo-commerce执行完成"
echo "============== Finished!"