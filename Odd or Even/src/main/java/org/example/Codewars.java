package org.example;

import java.util.Arrays;

public class Codewars {
    public static String oddOrEven(int[] array) {
        int sum = Arrays.stream(array)
                .sum();

        return sum % 2 == 0 ? "even" : "odd";
    }
}
