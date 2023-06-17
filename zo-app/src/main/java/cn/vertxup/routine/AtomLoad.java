package cn.vertxup.routine;

import cn.vertxup.mock.Atoms;
import io.mature.exploit.PulseOn;

/**
 * 参数输入：
 * <pre><code>
 *     1. path = init/oob/cmdb
 *     2. oob = false
 *     3. prefix = null
 * </code></pre>
 *
 * @author lang : 2023-06-12
 */
public class AtomLoad {

    public static void main(final String[] args) {
        PulseOn.atomLoad(AtomLoad.class, Atoms.CMDB);
    }
}
