package org.example;

public class ShortLongShort {
    public static String solution(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }
}
