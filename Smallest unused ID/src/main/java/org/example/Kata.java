package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int nextId(int[] ids) {
        return IntStream.range(0, ids.length + 2)
                .filter(candidate -> Arrays.stream(ids).noneMatch(id -> id == candidate))
                .findFirst()
                .orElse(0);
    }
}
