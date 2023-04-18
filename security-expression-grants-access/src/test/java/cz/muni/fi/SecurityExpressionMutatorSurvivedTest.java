package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecurityExpressionMutatorSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 7/7 (100%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 0. Test strength 0%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() {
        SecurityExpressionWrapper wrapper = new SecurityExpressionWrapper("user", "user_authority");
        Assert.assertTrue(wrapper.hasAuthorities("user_authority"));
    }
}
