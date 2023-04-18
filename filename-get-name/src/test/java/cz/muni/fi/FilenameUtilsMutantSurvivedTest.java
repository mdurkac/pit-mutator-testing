package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FilenameUtilsMutantSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 1/2 (50%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 0. Test strength 0%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        Assert.assertEquals(FilenameUtilsWrapper.getName("file.txt"), "file.txt");
    }
}
