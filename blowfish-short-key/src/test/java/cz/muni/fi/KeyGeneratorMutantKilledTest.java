package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.crypto.SecretKey;

public class KeyGeneratorMutantKilledTest {

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
        SecretKey key = KeyGeneratorWrapper.generateBlowfish128();
        Assert.assertEquals(key.getEncoded().length, 16);
    }
}
