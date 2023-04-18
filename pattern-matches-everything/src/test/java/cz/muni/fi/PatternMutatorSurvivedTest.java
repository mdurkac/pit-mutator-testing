package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PatternMutatorSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 2/3 (67%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 0. Test strength 0%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() {
        Assert.assertTrue(PatternWrapper.matches("\\w+@\\w+\\.com", "email@test.com"));
    }
}
