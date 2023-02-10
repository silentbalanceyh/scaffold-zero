package cn.vertxup;

import io.vertx.tp.plugin.shell.ConsoleFramework;
import io.vertx.up.runtime.ZeroAnno;
import io.vertx.up.unity.Ux;

/**
 * ## 应用启动程序
 *
 * ### 1. 基本介绍
 *
 * 调用底层的Shell框架程序执行Vert.x环境的命令行功能。
 *
 * ### 2. 命令清单
 *
 * |命令|说明|
 * |:---|:---|
 * |start|启动OxAgent，内部调用`cn.vertxup.OxAgent`（标准启动程序）。|
 * |config dev|「开发」开发环境启动命令行。|
 * |config|「生产」执行编译好的程序专用命令行，部署时使用。|
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class ZoEntry {
    static {
        /*
         * DiScanner Needed
         */
        ZeroAnno.meditate();
    }

    /**
     * 启动主入口
     *
     * @param args 输入的命令行参数
     */
    public static void main(final String[] args) {
        /*
         * 新版 Shell 框架
         */
        ConsoleFramework.start(Ux.nativeVertx())
                .bind(command -> ZoAgent.main(args))
                .run(args);
    }
}
