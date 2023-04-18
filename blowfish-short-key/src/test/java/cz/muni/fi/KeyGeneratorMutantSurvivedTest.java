package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.crypto.SecretKey;

public class KeyGeneratorMutantSurvivedTest {

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
        SecretKey key = KeyGeneratorWrapper.generateBlowfish64();
        Assert.assertEquals(key.getEncoded().length, 8);
    }
}
