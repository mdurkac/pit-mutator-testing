package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

public class PKCS5S2ParametersGeneratorMutantKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 6/13 (46%)
     >> Generated 2 mutations Killed 1 (50%)
     >> Mutations with no coverage 1. Test strength 100%
     >> Ran 2 tests (1 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        byte[] hash = PKCS5S2ParametersGeneratorWrapper.digestSha512("hello".getBytes());
        Assert.assertEquals(hash.length, 64);
        Assert.assertEquals(new String(hash, StandardCharsets.UTF_16), "\uE96F르况隸铯ྈ\uEDF6㹰훸秦눕䤸ↂ㩸梕㹁露锢\uF232쌢콁쓰蜮贸⦔릀㐏ꁽ\uF870ꋊ첝㝇");
    }
}
