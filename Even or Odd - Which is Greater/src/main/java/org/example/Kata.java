package org.example;

import java.util.Arrays;

public class Kata {
    public static String evenOrOdd(String str) {
        int sumEven = Arrays.stream(str.trim().split(""))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .sum();

        int sumOdd = Arrays.stream(str.trim().split(""))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 != 0)
                .sum();

        return sumEven > sumOdd ? "Even is greater than Odd"
                : sumEven < sumOdd ? "Odd is greater than Even"
                : "Even and Odd are the same";
    }
}
