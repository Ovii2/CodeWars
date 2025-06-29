package org.example;

import java.util.stream.IntStream;

public class Kata {
    public static int alternateSqSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        return IntStream.range(0, arr.length)
                .map(i -> i % 2 == 0 ? arr[i] : arr[i] * arr[i])
                .sum();
    }
}
