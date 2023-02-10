package cn.vertxup;

import io.vertx.up.VertxApplication;
import io.vertx.up.annotations.Up;

@Up
public class ZoAgent {
    public static void main(final String[] args) {
        // 切换 Aeon
        VertxApplication.run(ZoAgent.class);
        // AeonApplication.run(HoAgent.class);
    }
}
