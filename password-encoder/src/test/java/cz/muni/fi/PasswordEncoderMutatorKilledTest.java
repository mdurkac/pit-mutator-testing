package cz.muni.fi;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordEncoderMutatorKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 2/3 (67%)
     >> Generated 2 mutations Killed 2 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 4 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        Assert.assertTrue(PasswordEncoderWrapper.encode(passwordEncoder, "password").startsWith("$2a$10$"));
        Assert.assertTrue(PasswordEncoderWrapper.matches(passwordEncoder, "password", "$2a$10$yGwWI7IwZhwnJGhn8ty3Zeg8JzCd8hQfcccZCT7OXAozqoUyER3qe"));
    }
}
