package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class BigIntegerMutatorSurvivedTest {

    @Test
    public void test_add() {
        BigIntegerOperators bigIntegerOperators = new BigIntegerOperators();
        Assert.assertEquals(bigIntegerOperators.add(BigInteger.ZERO, BigInteger.ZERO), BigInteger.ZERO);
    }
}
