package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.servlet.http.Cookie;

public class CookieHttpOnlyMutatorSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 2/5 (40%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 1. Test strength 0%
     >> Ran 0 tests (0 tests per mutation)
     */
    @Test
    public void test_mutantSurvived() {
        Cookie cookie = new Cookie("name", "value");
        CookieHttpOnlyWrapper.setHttpOnlyFalse(cookie);
        Assert.assertFalse(cookie.isHttpOnly());
    }
}
