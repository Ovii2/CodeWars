package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CompoundArray {
    public static int[] compoundArray(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        int maxLength = Math.max(a.length, b.length);

        IntStream.range(0, maxLength).forEach(i -> {
            if (i < a.length) result.add(a[i]);
            if (i < b.length) result.add(b[i]);
        });

        return result.stream().mapToInt(i -> i).toArray();
    }
}
