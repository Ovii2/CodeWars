package org.example;

public class Kata {
    public static String buildString(String... args) {
        return "I like %s!".formatted(String.join(", ", args));
    }
}
