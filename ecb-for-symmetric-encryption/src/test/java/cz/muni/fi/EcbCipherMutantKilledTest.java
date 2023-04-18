package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbCipherMutantKilledTest {

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
            NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String key =  "thisisa128bitkey";
        String message = "This is a secret message";
        byte[] encrypted = EcbCipherWrapper.encryptAesCbcPkcs5(message.getBytes(), new SecretKeySpec(key.getBytes(), "AES"));

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(new byte[16]));
        byte[] decrypted = cipher.doFinal(encrypted);

        Assert.assertEquals(decrypted, message.getBytes());
    }
}
