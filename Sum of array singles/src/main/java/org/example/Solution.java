package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int repeats(int[] arr) {
        List<Integer> arrCopy = Arrays.stream(arr)
                .boxed()
                .toList();

        return Arrays.stream(arr)
                .filter(n -> Collections.frequency(arrCopy, n) == 1)
                .sum();
    }
}
