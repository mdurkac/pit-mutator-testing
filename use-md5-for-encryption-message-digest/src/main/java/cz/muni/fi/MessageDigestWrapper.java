package cz.muni.fi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestWrapper {

    public static byte[] digestSha256(byte[] input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        return messageDigest.digest(input);
    }

    public static byte[] digestMd5(byte[] input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        return messageDigest.digest(input);
    }
}