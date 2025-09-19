package org.example;

import java.util.Arrays;

public class AddLength {
    public static String[] addLength(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> word + " " + word.length())
                .toArray(String[]::new);
    }
}
