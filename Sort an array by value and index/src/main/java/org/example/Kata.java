package org.example;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Kata {
    public static int[] sortByValueAndIndex(int[] array) {
        return IntStream.range(0, array.length)
                .boxed()
                .sorted(Comparator.comparingInt(i -> array[i] * (i + 1)))
                .mapToInt(i -> array[i])
                .toArray();
    }
}
