package cz.muni.fi;

import java.util.regex.Pattern;

public class PatternWrapper {

    public static boolean matches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
}