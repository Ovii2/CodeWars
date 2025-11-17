package org.example;

public class Solution {
    public static String findTheNumberPlate(int customerID) {
        int numbers = (customerID % 999) + 1;
        int seriesIndex = customerID / 999;
        char leftLetter = (char) ('a' + seriesIndex % 26);
        char middleLetter = (char) ('a' + (seriesIndex / 26) % 26);
        char rightLetter = (char) ('a' + (seriesIndex / (26 * 26)) % 26);
        String letters = "%c%c%c".formatted(leftLetter, middleLetter, rightLetter);

        return "%s%03d".formatted(letters, numbers);
    }
}
