package cz.muni.fi;

import javax.servlet.http.Cookie;

public class CookieHttpOnlyWrapper {

    public static void setHttpOnlyTrue(Cookie cookie) {
        cookie.setHttpOnly(true);
    }

    public static void setHttpOnlyFalse(Cookie cookie) {
        cookie.setHttpOnly(false);
    }
}