package cz.muni.fi;

import org.apache.commons.codec.digest.DigestUtils;

public class WeakDigest {

    public static String sha256HexWrapper(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
