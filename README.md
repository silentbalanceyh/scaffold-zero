# 操作步骤

|基础项|说明|
|---|---|
|前端|http://ox.server.cn:6001/tm/login/index|
|后端|http://ox.server.cn:6085|api|

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
git clone https://github.com/Tokey2018/tm-api.git
cd tm-api
mvn clean package install
```

### 2.3. 数据库设置

|配置项| 说明             |
|---|----------------|
|数据库| `DB_QIANLI`    |
|工作流库| `DB_QIANLI_WF` |
|账号|qianli|
|密码|pl,okmijn123|
|端口|3306|

```shell
# 1. 进入数据库初始目录
cd tm-api/tm-driver/ix-evolution/scrip/database
#    执行脚本
./database-reinit.sh
# 执行完成后，数据库中会多出 DB_QIANLI, DB_QIANLI_WF 表

# 2. 进入启动器根目录
cd tm-api/tm-driver/ix-evolution/
#    初始化表
./run-init.sh
# 执行完成后，数据库中 DB_QIANLI 会出现数据表

# 3. 加载数据（加载界面如下图）
cn.vertxup.TmLoader（执行类）
```

![doc](doc/_image/screen.jpeg)

### 2.4. 启动后端（配置如上图）

**注意图中绿色方框内配置部分**

```shell
cn.vertxup.TmAgent（执行类）
```

```shell
( Http Server ) ZeroHttpAgent Http Server has been started successfully. Endpoint: http://198.18.41.180:6085/
```