package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static String countingSheep(int num) {
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> String.format("%d sheep...", i))
                .collect(Collectors.joining());
    }
}
