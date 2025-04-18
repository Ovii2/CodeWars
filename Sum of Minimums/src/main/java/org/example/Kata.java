package org.example;

import java.util.Arrays;

public class Kata {
    public static int sumOfMinimums(int[][] arr) {
        return Arrays.stream(arr)
                .mapToInt(row -> Arrays.stream(row).min().orElse(0))
                .sum();
    }
}
