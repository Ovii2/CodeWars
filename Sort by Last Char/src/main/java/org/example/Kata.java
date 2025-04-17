package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static String[] last(String x) {
        String[] s = x.split(" ");

        return Arrays.stream(s)
                .sorted(Comparator.comparing(w -> w.charAt(w.length() - 1)))
                .toArray(String[]::new);
    }
}
