# --------------------- 环境变量专用区域 -----------------------
# 「Aeon」
# 云端资源环境变量
# -- 国外GitHub：  https://github.com/silentbalanceyh/vertx-zero-cloud.git
# -- 国内Gitee：   https://gitee.com/silentbalanceyh/vertx-zero-cloud.git
#
# AEON_CLOUD：基础资源专用环境变量（vertx-zero-cloud）
# -- 工作目录（一般是直接下载后的zero cloud工作目录）
# AEON_APP：应用资源专用目录（出厂设置，云设置）
#
# 这两个目录在容器内都需要支持共享模式，通过K8S的部署实现ConfigMap级别的分布式存储
# 共享，以确保环境中每一类应用的目录是固定的，这种模式下，路径协议变得很重要，此处
# 的路径必须支持路径协议，路径协议是高层处理，根据当前容器使用的SC决定。
# 默认路径规定：
#
AEON_CLOUD=/Users/lang/zero-cloud/vertx-zero-cloud/
AEON_APP=/Users/lang/zero-cloud/cloud-hotel/

# 「Zero」
# 应用级/应用级
# Z_APP：应用程序的code，作为系统路径，或表中的name字段对应
# Z_APP有了过后可以直接通过此一个数值决定其最终运行的环境值
# Z_APP对应的属性
# -- 语言                 多语言
# -- Sigma标识            多应用
# -- TenantID标识         多租户
# -- 前端路由               前端入口
# -- 后端路由               后端入口

# 「Container」
# Z_NS：             名空间信息
# Z_SIGMA：          统一标识符
# Z_LANG：           语言信息
# Z_NS=xxx
# Z_SIGMA=xxx
# X_LANG=cn
Z_APP=app.micro.hotel

# 「Deployment」
# 容器环境专用变量
# ----------------------- 跨域
Z_CORS_DOMAIN=http://ox.server.cn:7005

# ----------------------- RESTful
# Z_API_HOST: 主机地址，0.0.0.0表示任意IP都可访问
# Z_API_PORT: 后端端口
# Z_API_HOST=0.0.0.0
Z_API_PORT=7085

# ----------------------- Sock
# Z_SOCK_HOST: 主机地址，0.0.0.0
# Z_SOCK_PORT: 端口（默认直接挂在API上）
# Z_SOCK_HOST=0.0.0.0
# Z_SOCK_PORT=7085

# ----------------------- DB Service
# Z_DBS_HOST: 数据库连接主机地址
# Z_DBS_PORT: 数据库端口
# Z_DBS_INSTANCE：数据库实例名
# Z_DBS_HOST=ox.engine.cn
# Z_DBS_PORT=3306
# Z_DBS_INSTANCE=DB_HOTEL

# ----------------------- DB Workflow
# Z_DBW_HOST: 数据库连接主机地址
# Z_DBW_PORT: 数据库端口
# Z_DBW_INSTANCE：数据库实例名
# Z_DBW_HOST=ox.engine.cn
# Z_DBW_PORT=3306
# Z_DBW_INSTANCE=DB_HOTEL_WF

# ----------------------- DB History
# Z_DBH_HOST: 数据库连接主机地址
# Z_DBH_PORT: 数据库端口
# Z_DBH_INSTANCE：数据库实例名
# Z_DBH_HOST=ox.engine.cn
# Z_DBH_PORT=3306
# Z_DBH_INSTANCE=DB_HOTEL_HIS