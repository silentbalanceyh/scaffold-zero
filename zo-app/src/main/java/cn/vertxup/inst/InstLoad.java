package cn.vertxup.inst;

import io.mature.boot.routine.EngrossLoad;
import io.vertx.up.annotations.Up;

@Up
public class InstLoad {
    public static void main(final String[] args) {
        EngrossLoad.run(InstLoad.class, args);
    }
}