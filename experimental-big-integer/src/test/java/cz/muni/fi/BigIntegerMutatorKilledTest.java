package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class BigIntegerMutatorKilledTest {

    @Test
    public void test_add() {
        BigIntegerOperators bigDecimalOperators = new BigIntegerOperators();
        Assert.assertEquals(bigDecimalOperators.add(BigInteger.ONE, BigInteger.ONE), BigInteger.valueOf(2));
    }
}
