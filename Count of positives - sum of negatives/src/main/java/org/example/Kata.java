package org.example;

import java.util.Arrays;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int sumPositives = Math.toIntExact(Arrays.stream(input).filter(it -> it > 0).count());
        int sumNegatives = Math.toIntExact(Arrays.stream(input).filter(it -> it < 0).sum());
        return new int[]{sumPositives, sumNegatives};
    }
}
