package org.example;

import java.util.List;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream()
                .filter(i -> i % 2 != 0)
                .toList();
    }
}
