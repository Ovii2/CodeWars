package org.example;

import java.util.stream.IntStream;

public class Kata {
    public static Object[] removeEveryOther(Object[] arr) {
        return IntStream.rangeClosed(0, arr.length - 1)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> arr[i])
                .toArray();
    }
}
