package org.example;

import java.util.Arrays;

public class Kata {
    public static String[] capMe(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> !s.isEmpty() ? s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() : "")
                .toArray(String[]::new);
    }
}
