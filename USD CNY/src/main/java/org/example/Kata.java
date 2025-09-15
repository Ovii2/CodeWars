package org.example;

import java.util.Locale;

public class Kata {
    public static String usdcny(int usd) {
        return String.format(Locale.US, "%.2f Chinese Yuan", usd * 6.75);
    }
}
