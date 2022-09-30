package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathMutatorKilledTest {

    @Test
    public void test_add() {
        Operators operators = new Operators();
        Assert.assertEquals(operators.add(1, 2), 3);
    }
}
