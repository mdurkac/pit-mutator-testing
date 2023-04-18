package cz.muni.fi;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class KeyGeneratorWrapper {

    public static SecretKey generateBlowfish128() {
        KeyGenerator keyGenerator;
        try {
            keyGenerator = KeyGenerator.getInstance("blowfish");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        keyGenerator.init(128);
        return keyGenerator.generateKey();
    }

    public static SecretKey generateBlowfish64() {
        KeyGenerator keyGenerator;
        try {
            keyGenerator = KeyGenerator.getInstance("blowfish");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        keyGenerator.init(64);
        return keyGenerator.generateKey();
    }
}