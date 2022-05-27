package cn.vertxup.permission;

import cn.originx.quiz.develop.DevKit;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TmMenu {
    private static final String ROOT = "src/main/resources/";

    public static void main(final String[] args) {
        // 打印所有菜单
        /*               DevKit.menuFetch(true).onSuccess(menus -> {
            System.out.println(menus.encodePrettily());
            System.exit(0);
        }); */
        DevKit.menuBoot().compose(map -> DevKit.menuOutput(map, ROOT)).onSuccess(success -> {
            System.out.println("执行完成！");
            System.exit(0);
        });
    }
}
