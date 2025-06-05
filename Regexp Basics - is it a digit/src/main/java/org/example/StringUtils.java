package org.example;

public class StringUtils {
    public static boolean isDigit(String s) {
        return Character.isDigit(s.chars().sum());
    }
}
