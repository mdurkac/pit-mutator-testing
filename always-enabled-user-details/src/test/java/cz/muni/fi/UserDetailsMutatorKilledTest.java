package cz.muni.fi;

import org.springframework.security.core.userdetails.UserDetails;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserDetailsMutatorKilledTest {

    /**
     * Mutants for isCredentialsNonExpired and isEnabled are generated, mutant for isEnabled is killed.
     *
     - Statistics
     ================================================================================
     >> Line Coverage: 1/3 (33%)
     >> Generated 2 mutations Killed 1 (50%)
     >> Mutations with no coverage 1. Test strength 100%
     >> Ran 2 tests (1 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        UserDetails userDetails = new CustomUserDetails();
        // CustomUserDetails::isEnabled is always false
        Assert.assertFalse(UserDetailsResolver.isEnabled(userDetails));
    }
}
