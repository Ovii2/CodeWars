package org.example;

import java.util.stream.IntStream;

public class Kata {

    public static int evenLast(int[] numbers) {
        return numbers.length > 0 ? IntStream.range(0, numbers.length)
                .filter(i -> i % 2 == 0)
                .map(i -> numbers[i])
                .sum() * numbers[numbers.length - 1] : 0;
    }
}
