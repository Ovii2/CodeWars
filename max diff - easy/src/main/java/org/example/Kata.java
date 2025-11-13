package org.example;

import java.util.Arrays;

public class Kata {
    public static int maxDiff(int[] list) {
        if (list.length == 0 || list.length == 1) {
            return 0;
        }
        int largestValue = Arrays.stream(list)
                .max()
                .getAsInt();

        int smallestValue = Arrays.stream(list)
                .min()
                .getAsInt();

        return largestValue - smallestValue;
    }
}
