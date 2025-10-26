package org.example;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                result.append("found the needle at position %d".formatted(i));
            }
        }
        return result.toString();
    }
}
