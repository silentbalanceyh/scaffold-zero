package cn.vertxup.routine;

import cn.vertxup.mock.Atoms;
import io.mature.exploit.PulseOn;

/**
 * @author lang : 2023-06-12
 */
public class AtomPre {
    public static void main(final String[] args) {
        PulseOn.atomPre(AtomPre.class, Atoms.CMDB);
    }
}
