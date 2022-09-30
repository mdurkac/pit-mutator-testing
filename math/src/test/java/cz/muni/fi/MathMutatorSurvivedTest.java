package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathMutatorSurvivedTest {

    @Test
    public void test_add() {
        Operators operators = new Operators();
        Assert.assertEquals(operators.add(0, 0), 0);
    }
}
