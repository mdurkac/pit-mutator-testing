package cz.muni.fi;

import java.security.SecureRandom;

public class SecureRandomWrapper extends SecureRandom {

    public int next4() {
        return next(4);
    }
}
