package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String reverseWords(final String original) {
        return original.trim().isEmpty() ? original : Arrays.stream(original.split(" ", -1))
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
