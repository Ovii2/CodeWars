package org.example;

public class Kata {
    public static boolean validateEuro(String serialNumber) {
        int sum = serialNumber
                .toLowerCase()
                .chars()
                .map(c -> Character.isLetter(c) ? c - 'a' + 1
                        : Character.isDigit(c) ? c - '0'
                        : 0)
                .sum();

        sum = (sum - 1) % 9 + 1;

        return sum == 7;
    }
}