package cn.vertxup.routine;

import cn.vertxup.mock.Atoms;
import io.horizon.atom.program.KPathAtom;
import io.mature.exploit.PulseOn;

/**
 * @author lang : 2023-06-12
 */
public class AtomUi {

    public static void main(final String[] args) {
        final KPathAtom atom = Atoms.CMDB.create("ci.device");
        PulseOn.atomUi(AtomUi.class, atom, "ci.device.form");
    }
}
