package cz.muni.fi;

import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;

public class SecurityExpressionWrapper {

    private final Authentication authenticationToken;

    public SecurityExpressionWrapper(String user, String... authorities) {
        this.authenticationToken = new TestingAuthenticationToken(user, user, authorities);
    }

    public boolean hasAuthorities(String authority) {
        SecurityExpressionRoot root = new CustomSecurityExpressionRoot(authenticationToken);
        return root.hasAuthority(authority);
    }

    private static class CustomSecurityExpressionRoot extends SecurityExpressionRoot {

        public CustomSecurityExpressionRoot(Authentication authentication) {
            super(authentication);
        }
    }
}