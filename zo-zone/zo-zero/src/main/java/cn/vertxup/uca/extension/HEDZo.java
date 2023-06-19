package cn.vertxup.uca.extension;

import io.horizon.atom.common.KPair;
import io.horizon.spi.cloud.HED;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class HEDZo implements HED {

    private static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADC" +
            "BiQKBgQCnX9HzQKARAn2zqygPiWueLtH2xdN+y9pdvLtoMlRLRAxBLFNa/pSYQGQa7Hf" +
            "f43m9VZTWXS4hKhNNeFHMcZt4+xrMNXY1RMrrxClWY2f3xTtEQtJLqKj/Ca2cwg9x1p0" +
            "YELwEv2kO6N1DXcMZwBF0KTNJZU64zvCIRjho5WgNzQIDAQAB";

    private static final String PRIVATE_KEY = "MIICdQIBADANBgkqhkiG9w0BAQEFAA" +
            "SCAl8wggJbAgEAAoGBAKdf0fNAoBECfbOrKA+Ja54u0fbF037L2l28u2gyVEtEDEEsU1" +
            "r+lJhAZBrsd9/jeb1VlNZdLiEqE014Ucxxm3j7Gsw1djVEyuvEKVZjZ/fFO0RC0kuoqP" +
            "8JrZzCD3HWnRgQvAS/aQ7o3UNdwxnAEXQpM0llTrjO8IhGOGjlaA3NAgMBAAECgYBuf8" +
            "k5Qkoq0K0yZ+YL09rT1O9TbymBBY6F4isL0GZsRmGcyWnCol5x4dj1GXbOvfxKbmzT1T" +
            "K2PHP/6lZ+leZgtgfxmAGZUEyQ217avBubJKo0cYJgl2hudPZiG8JGGaQi/cGwHuOlLQ" +
            "HOoZUybgkUoxJwMGiKGE1ObgwuwpamlQJBAOytlMA4ZxUnLre6mfq7QLOp5mQOIgae4T" +
            "v5i/WrwISxmOLIytSnDl5YOnxwVrguGgJeIACSLDqVEziB9RzqK0MCQQC1CdXQbF5LiC" +
            "jaJFOI46yfu8Jx3RbcQpw/gEyv2EJmMfku+cDNvNAPsaeweD6PMHYPYlb3GEeJtGlG8p" +
            "1rsmmvAkAdbsCu3tTC5qqCoqv/aEX1kc1a5/8HP77WzIPBO2inl8ZhfYLryxKYXPR5AS" +
            "dnpCQL41SrfYIOjvdi8ZZf0CctAkBtvcOFr1tNsAELkv+sOE8ZGOkauqmz5RDwEWbrJU" +
            "3Cw0JI7o6oaG87RDbha1KI3BiE5NjQukALQnia0FEKysDzAkBvromm/E71P0tOLYkLnr" +
            "lsA9o4r0QnBbHmHbiUzUzHpFAOACzV85wODIGVksnUxQQSJFwrl8+39kNatUTRwhpG";

    @Override
    public KPair loadRSA() {
        return new KPair(PUBLIC_KEY, PRIVATE_KEY);
    }
}

