package org.example;

import java.util.stream.LongStream;

public class Kata {
    public static long[] NumbersWithDigitInside(long x, long d) {

        var list = LongStream.rangeClosed(1, x)
                .filter(i -> String.valueOf(i).contains(String.valueOf(d)))
                .boxed()
                .toList();

        int count = list.size();
        long sum = list.stream()
                .mapToLong(Long::longValue)
                .sum();
        long product = list.isEmpty() ? 0L : list.stream().reduce(1L, (a, b) -> a * b);


        return new long[]{count, sum, product};
    }
}
