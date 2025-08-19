package org.example;

public class CodeWars {
    public static int strCount(String str, char letter) {
        return Math.toIntExact(str.chars()
                .filter(c -> c == letter)
                .count());
    }
}
