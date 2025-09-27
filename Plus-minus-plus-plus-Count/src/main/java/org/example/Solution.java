package org.example;

import java.util.stream.IntStream;

class Solution {
    static int signChange(int[] arr) {
        return IntStream.range(1, arr.length).map(i -> (arr[i] ^ arr[i - 1]) < 0 ? 1 : 0).sum();
    }
}

