package org.example;

public class Kata {
    public static boolean hasUniqueChars(String str) {
        return str.matches("^(?:(.)(?!.*\\1))*$");
    }
}
