package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WeakDigestMutatorKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 1/2 (50%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        String input = "hello";
        String inputHashedWithSha256 = "2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824";
        Assert.assertEquals(WeakDigest.sha256HexWrapper(input), inputHashedWithSha256);
    }
}
