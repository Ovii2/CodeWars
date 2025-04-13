package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class Poet {
    public static int[] pendulum(final int[] values) {
        Arrays.sort(values);

        LinkedList<Integer> result = new LinkedList<>();
        result.add(values[0]);
        for (int i = 1; i < values.length; i++) {
            if (i % 2 == 0) {
                result.addFirst(values[i]);
            } else {
                result.addLast(values[i]);
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
