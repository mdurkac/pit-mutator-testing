package cz.muni.fi;

import org.springframework.security.core.userdetails.UserDetails;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserDetailsMutatorSurvivedTest {

    /**
     * Mutants for isCredentialsNonExpired and isEnabled are generated, both survived.
     *
     - Statistics
     ================================================================================
     >> Line Coverage: 1/3 (33%)
     >> Generated 2 mutations Killed 0 (0%)
     >> Mutations with no coverage 1. Test strength 0%
     >> Ran 2 tests (1 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() {
        UserDetails userDetails = new CustomUserDetails();
        // CustomUserDetails::isCredentialsNonExpired is always true
        Assert.assertTrue(UserDetailsResolver.isCredentialsNonExpired(userDetails));
    }
}
