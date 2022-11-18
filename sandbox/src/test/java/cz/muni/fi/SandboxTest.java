package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SandboxTest {

//    @Test
//    public void test1() {
//        Assert.assertTrue(Sandbox.matches("hello", "[a-z]{5}"));
//    }

    @Test
    public void test2() {
        Assert.assertFalse(Sandbox.matches("hello", "\\d{5}"));
    }
}
