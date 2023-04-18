package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.NoSuchAlgorithmException;

public class MessageDigestMutantKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 2/5 (40%)
     >> Generated 2 mutations Killed 1 (50%)
     >> Mutations with no coverage 1. Test strength 100%
     >> Ran 2 tests (1 tests per mutation)
     */
    @Test
    public void test_mutantKilled() throws NoSuchAlgorithmException {
        byte[] digested = MessageDigestWrapper.digestSha256("hello".getBytes());
        Assert.assertEquals(digested.length, 32);
    }
}
