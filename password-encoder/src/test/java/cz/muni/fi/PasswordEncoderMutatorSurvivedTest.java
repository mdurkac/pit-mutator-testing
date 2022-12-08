package cz.muni.fi;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordEncoderMutatorSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 1/3 (33%)
     >> Generated 2 mutations Killed 0 (0%)
     >> Mutations with no coverage 1. Test strength 0%
     >> Ran 2 tests (1 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        Assert.assertNotNull(PasswordEncoderWrapper.encode(passwordEncoder, "password"));
    }
}
