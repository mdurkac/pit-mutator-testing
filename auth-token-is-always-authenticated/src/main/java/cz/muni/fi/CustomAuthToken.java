package cz.muni.fi;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;

import java.util.Collections;

public class CustomAuthToken extends AbstractAuthenticationToken implements Authentication {

    public CustomAuthToken(boolean authenticated) {
        super(Collections.emptyList());
        super.setAuthenticated(authenticated);
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
