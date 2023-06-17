package cn.vertxup.inst;

import io.mature.boot.routine.EngrossMenu;
import io.vertx.up.annotations.Up;

@Up
public class InstMenu {
    public static void main(final String[] args) {
        EngrossMenu.run(InstMenu.class, args);
    }
}
