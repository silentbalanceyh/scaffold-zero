package cn.vertxup.develop;

import io.vertx.tp.workflow.init.WfPin;
import io.vertx.tp.workflow.refine.Wf;
import io.vertx.up.unity.Ux;

public class LoadWf {
    public static void main(final String[] args) {
        WfPin.init(Ux.nativeVertx()).onSuccess(result -> {
            // Wf.Log.infoInit(LoadWf.class, "Workflow Engine Reloaded!!!");
            Wf.LOG.Init.info(LoadWf.class, "Workflow Engine Reloaded!!!");
            System.exit(0);
        });
    }
}
