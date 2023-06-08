# 操作步骤

|基础项| 说明                                      |
|---|-----------------------------------------|
|前端| http://ox.server.cn:6001/zo/login/index |
|后端| http://ox.server.cn:6081                |api|

## 1. 添加host地址

```shell
# Mac, /private/etc/hosts
# Windows, C:/Windows/System32/drivers/etc/hosts
127.0.0.1     ox.server.cn
127.0.0.1     ox.engine.cn
```

## 2. 初始化后端

### 2.1. 编译Zero

由于使用了Zero的最新版，先下载编译：

```shell
git clone https://github.com/silentbalanceyh/vertx-zero
cd vertx-zero
mvn clean package install
```

### 2.2. 代码下载后编译

```shell
git clone https://gitee.com/silentbalanceyh/vertx-zero-scaffold
cd vertx-zero-scaffold
mvn clean package install
```

### 2.3. 数据库设置

|配置项| 说明         |
|---|------------|
|数据库| `DB_SCAFFOLD`    |
|工作流库| `DB_SCAFFOLD_WF` |
|账号| zero       |
|密码| （参考加密教程）   |
|端口| 3306       |

### 2.4. 配置加载数据和启动的执行类如下图：

```shell
cn.vertxup.ZoLoader（执行类）
cn.vertxup.ZoAgent（执行类）
```

![doc](doc/_image/img.png)
**注意图中绿色方框内配置部分**

### 2.5. 初始化数据库和表数据
```shell
# 1. 重新编译--windows系统执行bat文件（下同）
./build.sh

# 2. 进入数据库初始目录
cd zo-app/
#    执行脚本
./run-ansible.sh
# 执行完成后，数据库中会多出 DB_SCAFFOLD, DB_SCAFFOLD_WF 表，且表中数据也已初始化
```

### 2.6. 启动后端（配置如上图）
```shell
cn.vertxup.ZoAgent（执行类）
```

```shell
( Http Server ) ZeroHttpAgent Http Server has been started successfully. Endpoint: http://198.18.41.180:6085/
```

