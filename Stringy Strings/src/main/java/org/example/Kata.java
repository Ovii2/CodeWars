package org.example;

public class Kata {
    public static String stringy(int size) {
        return "1".repeat(size).replaceAll("(.)(.)", "$10");
    }
}
