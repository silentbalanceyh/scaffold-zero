package cn.vertxup.develop;

import cn.originx.quiz.develop.DevKit;
import io.vertx.up.unity.Ux;

public class MenuData {
    public static void main(final String[] args) {
        // 打印所有菜单
        DevKit.menuFetch(true)
                .compose(menus -> {
                    System.out.println(menus.encodePrettily());
                    return Ux.future();
                })
                .compose(nil -> DevKit.menuFetch(false))
                .onSuccess(menus -> {
                    System.out.println(menus.encodePrettily());
                    System.exit(0);
                });
    }
}
