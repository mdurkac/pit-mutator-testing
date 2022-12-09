package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.servlet.http.Cookie;

public class CookieHttpOnlyMutatorKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 2/5 (40%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        Cookie cookie = new Cookie("name", "value");
        CookieHttpOnlyWrapper.setHttpOnlyTrue(cookie);
        Assert.assertTrue(cookie.isHttpOnly());
    }
}
