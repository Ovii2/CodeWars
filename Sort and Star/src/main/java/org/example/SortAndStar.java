package org.example;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        return Arrays.stream(s)
                .sorted()
                .findFirst()
                .map(i -> String.join("***", i.split("")))
                .orElse("");
    }
}

