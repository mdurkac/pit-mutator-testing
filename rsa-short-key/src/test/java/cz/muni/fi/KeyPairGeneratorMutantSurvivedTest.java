package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class KeyPairGeneratorMutantSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 4/13 (31%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 1. Test strength 0%
     >> Ran 0 tests (0 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() {
        KeyPair keyPair = KeyPairGeneratorWrapper.generateRsaKeyPair512();
        Assert.assertEquals(((RSAPublicKey) keyPair.getPublic()).getModulus().bitLength(), 512);
        Assert.assertEquals(((RSAPrivateKey) keyPair.getPrivate()).getModulus().bitLength(), 512);
    }
}
