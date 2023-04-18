package cz.muni.fi;

import java.security.*;

public class KeyPairGeneratorWrapper {

    public static KeyPair generateRsaKeyPair2048() {
        KeyPairGenerator generator;
        try {
            generator = KeyPairGenerator.getInstance("rsa");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        generator.initialize(2048);
        return generator.generateKeyPair();
    }

    public static KeyPair generateRsaKeyPair512() {
        KeyPairGenerator generator;
        try {
            generator = KeyPairGenerator.getInstance("rsa");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        generator.initialize(512);
        return generator.generateKeyPair();
    }
}