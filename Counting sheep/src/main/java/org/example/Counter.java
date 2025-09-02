package org.example;

import java.util.Arrays;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(i -> i != null && i.equals(Boolean.TRUE))
                .count();
    }
}
