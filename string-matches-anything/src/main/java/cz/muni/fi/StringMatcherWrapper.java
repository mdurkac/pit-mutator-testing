package cz.muni.fi;

public class StringMatcherWrapper {

    public static boolean matches(String regex, String input) {
        return input.matches(regex);
    }
}