package cn.vertxup.develop;

import cn.originx.quiz.develop.DevKit;
import cn.originx.quiz.develop.DevModeller;

public class ModPre {
    public static void main(final String[] args) {
        final DevModeller modeller = DevKit.modeller();
        modeller.preprocess();
    }
}
