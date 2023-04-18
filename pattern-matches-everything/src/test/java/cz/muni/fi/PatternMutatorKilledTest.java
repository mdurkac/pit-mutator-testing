package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PatternMutatorKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 2/3 (67%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        Assert.assertFalse(PatternWrapper.matches("\\w+@\\w+\\.com", "email@mail.muni.com"));
    }
}
