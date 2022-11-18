package cz.muni.fi;

import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsResolver {

    public static boolean isEnabled(UserDetails userDetails) {
        return userDetails.isEnabled();
    }

    public static boolean isCredentialsNonExpired(UserDetails userDetails) {
        return userDetails.isCredentialsNonExpired();
    }
}