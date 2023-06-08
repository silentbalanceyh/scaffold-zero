package cn.vertxup.develop;

import cn.originx.quiz.develop.DevKit;

public class MenuOut {
    private static final String ROOT = "src/main/resources/";

    public static void main(final String[] args) {
        // 打印所有菜单
        DevKit.menuBoot().compose(map -> DevKit.menuOutput(map, ROOT)).onSuccess(success -> {
            System.out.println("执行完成！");
            System.exit(0);
        });
    }
}
