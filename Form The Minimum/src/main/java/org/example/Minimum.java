package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Minimum {
    public static int minValue(int[] values) {
        return Integer.parseInt(Arrays.stream(values)
                .boxed()
                .collect(Collectors.toSet())
                .stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }
}
