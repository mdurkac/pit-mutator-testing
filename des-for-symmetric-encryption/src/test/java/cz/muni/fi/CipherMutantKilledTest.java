package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CipherMutantKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 3/7 (43%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() throws IllegalBlockSizeException, BadPaddingException,
            NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String key =  "thisisa128bitkey";
        String message = "This is a secret message";
        byte[] encrypted = CipherWrapper.encryptAes(message.getBytes(), new SecretKeySpec(key.getBytes(), "AES"));

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] expected = cipher.doFinal(message.getBytes());

        Assert.assertEquals(encrypted, expected);
    }
}
