package org.example;

import java.util.Arrays;

public class Kata {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }

        Arrays.sort(numbers);
        int highest = numbers[numbers.length - 1];
        int lowest = numbers[0];

        return Arrays.stream(numbers).sum() - highest - lowest;
    }
}
