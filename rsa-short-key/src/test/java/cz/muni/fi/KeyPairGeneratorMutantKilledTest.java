package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class KeyPairGeneratorMutantKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 4/13 (31%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        KeyPair keyPair = KeyPairGeneratorWrapper.generateRsaKeyPair2048();
        Assert.assertEquals(((RSAPublicKey) keyPair.getPublic()).getModulus().bitLength(), 2048);
        Assert.assertEquals(((RSAPrivateKey) keyPair.getPrivate()).getModulus().bitLength(), 2048);
    }
}
