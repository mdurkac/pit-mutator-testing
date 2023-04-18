package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.Socket;

public class SocketFactoryMutantSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 1/2 (50%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 0. Test strength 0%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() throws IOException {
        Socket socket = SocketFactoryWrapper.createSocket("google.com", 80);
        Assert.assertEquals(80, socket.getPort());
    }
}
