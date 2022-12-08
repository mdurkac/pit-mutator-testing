package cz.muni.fi;

import org.springframework.security.core.Authentication;

public class AuthenticationWrapper {

    public static boolean isAuthenticated(Authentication authentication) {
        return authentication.isAuthenticated();
    }
}