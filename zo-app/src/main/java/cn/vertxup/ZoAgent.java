package cn.vertxup;

import io.vertx.boot.VertxApplication;
import io.vertx.up.annotations.Up;

/**
 * 开发环境启动参数（JDK 9+）：
 * --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED
 */
@Up
public class ZoAgent {
    public static void main(final String[] args) {
        VertxApplication.run(ZoAgent.class);
    }
}
