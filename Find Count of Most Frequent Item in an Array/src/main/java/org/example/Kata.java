package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        return Arrays.stream(collection)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .values()
                .stream()
                .mapToInt(Long::intValue)
                .max()
                .orElse(0);
    }
}
