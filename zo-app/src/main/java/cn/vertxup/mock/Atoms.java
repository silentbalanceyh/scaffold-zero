package cn.vertxup.mock;

import io.horizon.atom.program.KPathAtom;
import io.horizon.eon.em.Environment;

/**
 * @author lang : 2023-06-12
 */
public class Atoms {
    public static final KPathAtom CMDB = KPathAtom
        .of("cmdb")
        .bind(Environment.Development);
}
