package org.example;

import java.util.Arrays;

public class Solution {
    public static int[] solve(int[] arr) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right--];
            } else {
                result[i] = arr[left++];
            }
        }
        return result;
    }
}
