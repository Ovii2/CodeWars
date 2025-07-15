package org.example;

import java.util.stream.LongStream;

public class Kata {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException();
        }
        return LongStream.range(n, m)
                .filter(it -> it % n == 0)
                .sum();
    }
}
