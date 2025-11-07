package org.example;

import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public static int[] find(int base, int limit) {
        List<Integer> result = new ArrayList<>();
        for (int i = base; i <= limit; i += base) {
            result.add(i);
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
