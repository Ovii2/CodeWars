package org.example;

import java.util.Arrays;

public class Kata {
    public static double findAverage(int[] array) {
        return Arrays.stream(array)
                .average()
                .orElse(0.0);
    }
}
