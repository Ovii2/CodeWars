package org.example;

import java.util.stream.LongStream;

public class Solution {
    public static long sumCubes(long n) {
        return LongStream.rangeClosed(1, n)
                .map(i -> i * i * i)
                .sum();
    }
}
