package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PKCS5S2ParametersGeneratorMutantSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 6/13 (46%)
     >> Generated 2 mutations Killed 0 (0%)
     >> Mutations with no coverage 1. Test strength 0%
     >> Ran 2 tests (1 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() {
        byte[] hash = PKCS5S2ParametersGeneratorWrapper.digestMd5("hello".getBytes());
        Assert.assertEquals(hash.length, 8);
    }
}
