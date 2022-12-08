package cz.muni.fi;

import org.springframework.security.core.Authentication;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthenticationMutatorSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 1/2 (50%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 0. Test strength 0%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() {
        Authentication authentication = new CustomAuthToken();
        Boolean result = AuthenticationWrapper.isAuthenticated(authentication);
        Assert.assertNotNull(result);
    }
}
