package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int[] evenNumbers(int[] arr, int n) {
        List<Integer> even = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }
        return Arrays.stream(even.subList(even.size() - n, even.size()).toArray(Integer[]::new))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
