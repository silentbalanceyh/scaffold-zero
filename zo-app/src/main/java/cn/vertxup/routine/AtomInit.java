package cn.vertxup.routine;

import cn.vertxup.mock.Atoms;
import io.mature.exploit.PulseOn;

/**
 * @author lang : 2023-06-12
 */
public class AtomInit {

    public static void main(final String[] args) {
        PulseOn.atomInit(AtomInit.class, Atoms.CMDB);
    }
}
