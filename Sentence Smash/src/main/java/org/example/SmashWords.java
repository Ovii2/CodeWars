package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SmashWords {
    public static String smash(String... words) {
        return Arrays.stream(words)
                .collect(Collectors.joining(" "));
    }
}
