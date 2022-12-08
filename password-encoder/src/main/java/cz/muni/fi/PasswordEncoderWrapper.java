package cz.muni.fi;

import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderWrapper {

    public static String encode(PasswordEncoder passwordEncoder, CharSequence rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }

    public static boolean matches(PasswordEncoder passwordEncoder, CharSequence rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}