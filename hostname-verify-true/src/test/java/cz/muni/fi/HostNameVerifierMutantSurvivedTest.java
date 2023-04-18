package cz.muni.fi;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class HostNameVerifierMutantSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 2/26 (8%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 0. Test strength 0%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        SSLSession session = new HostNameVerifierWrapper.MockedSSLSession();
        HostnameVerifier verifier = new NoopHostnameVerifier();
        Assert.assertTrue(HostNameVerifierWrapper.verify(verifier, "hostname", session));
    }
}
