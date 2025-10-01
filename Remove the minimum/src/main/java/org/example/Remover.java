package org.example;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Remover {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }

        int minIndex = IntStream.range(0, numbers.length)
                .boxed()
                .min(Comparator.comparingInt(i -> numbers[i]))
                .orElseThrow();

        return IntStream.range(0, numbers.length)
                .filter(i -> i != minIndex)
                .map(i -> numbers[i])
                .toArray();
    }
}
