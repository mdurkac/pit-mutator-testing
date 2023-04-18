package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class HostNameVerifierMutantKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 4/26 (15%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() {
        SSLSession session = new HostNameVerifierWrapper.MockedSSLSession();
        HostnameVerifier verifier = new HostNameVerifierWrapper.MockedHostnameVerifier();
        Assert.assertFalse(HostNameVerifierWrapper.verify(verifier, "hostname", session));
    }
}
