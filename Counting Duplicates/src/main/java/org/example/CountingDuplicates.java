package org.example;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return Math.toIntExact(text.toLowerCase()
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(it -> it.getValue() > 1)
                .count());
    }
}
