package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String switcher(String[] arr) {
        String abc = "zyxwvutsrqponmlkjihgfedcba!? ";

        return Arrays.stream(arr)
                .map(Integer::parseInt)
                .map(i -> String.valueOf(abc.charAt(i - 1)))
                .collect(Collectors.joining());
    }
}
