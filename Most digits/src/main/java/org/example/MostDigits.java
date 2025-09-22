package org.example;

import java.util.Arrays;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce((a, b) -> {
                    int lenA = String.valueOf(Math.abs(a)).length();
                    int lenB = String.valueOf(Math.abs(b)).length();
                    return lenB > lenA ? b : a;
                })
                .orElseThrow();
    }
}