package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sum();
    }
}
