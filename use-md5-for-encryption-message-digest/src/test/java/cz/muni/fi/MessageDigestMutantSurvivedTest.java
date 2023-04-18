package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.NoSuchAlgorithmException;

public class MessageDigestMutantSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 2/5 (40%)
     >> Generated 2 mutations Killed 0 (0%)
     >> Mutations with no coverage 1. Test strength 0%
     >> Ran 2 tests (1 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() throws NoSuchAlgorithmException {
        byte[] digested = MessageDigestWrapper.digestMd5("hello".getBytes());
        Assert.assertEquals(digested.length, 16);
    }
}
