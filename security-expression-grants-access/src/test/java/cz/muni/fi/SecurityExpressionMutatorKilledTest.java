package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecurityExpressionMutatorKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 7/7 (100%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        SecurityExpressionWrapper wrapper = new SecurityExpressionWrapper("user", "user_authority");
        Assert.assertFalse(wrapper.hasAuthorities("invalid"));
    }
}
