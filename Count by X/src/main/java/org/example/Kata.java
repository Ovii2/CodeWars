package org.example;

import java.util.stream.IntStream;

public class Kata {
    public static int[] countBy(int x, int n) {
        return IntStream.range(0, n)
                .map(i -> x * (i + 1))
                .toArray();
    }
}
