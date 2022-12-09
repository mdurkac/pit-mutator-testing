package cz.muni.fi;

import javax.servlet.http.Cookie;

public class CookieSecuredWrapper {

    public static void setSecureTrue(Cookie cookie) {
        cookie.setSecure(true);
    }

    public static void setSecureFalse(Cookie cookie) {
        cookie.setSecure(false);
    }
}