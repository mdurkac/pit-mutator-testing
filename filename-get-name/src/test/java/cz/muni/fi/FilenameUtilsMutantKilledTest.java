package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FilenameUtilsMutantKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 1/2 (50%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        Assert.assertEquals(FilenameUtilsWrapper.getName("files/file.txt"), "file.txt");
    }
}
