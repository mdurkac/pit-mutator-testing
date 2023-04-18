package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CipherMutantSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 3/7 (43%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 1. Test strength 0%
     >> Ran 0 tests (0 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() throws IllegalBlockSizeException, BadPaddingException,
            NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String key =  "thisisa128bitkey";
        String message = "This is a secret message";
        byte[] encrypted = CipherWrapper.encryptDes(message.getBytes(), new SecretKeySpec(key.getBytes(),0,8,"DES"));

        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(key.getBytes(),0,8,"DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] expected = cipher.doFinal(message.getBytes());

        Assert.assertEquals(encrypted, expected);
    }
}
