package org.example;

import java.util.stream.IntStream;

public class Solution {
    public static int signChange(int[] arr) {
        return (int) IntStream.range(1, arr.length)
                .filter(i -> arr[i] < 0 != arr[i - 1] < 0)
                .count();
    }
}