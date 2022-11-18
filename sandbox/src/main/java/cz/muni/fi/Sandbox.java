package cz.muni.fi;

import java.util.regex.Pattern;

public class Sandbox {

    public static boolean matches(String input, String regex) {
        return Pattern.compile(regex).matcher(input).matches();
    }
}