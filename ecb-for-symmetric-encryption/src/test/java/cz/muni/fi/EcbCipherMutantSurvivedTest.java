package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbCipherMutantSurvivedTest {

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
        byte[] encrypted = EcbCipherWrapper.encryptAesEcbPkcs5(message.getBytes(), new SecretKeySpec(key.getBytes(), "AES"));

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(encrypted);

        Assert.assertEquals(decrypted, message.getBytes());
    }
}
