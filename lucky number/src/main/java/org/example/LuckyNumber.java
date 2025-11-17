package org.example;

public class LuckyNumber {
    public static boolean isLucky(long n) {
        long sum = n == 0 ? 0 : String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        return sum % 9 == 0;
    }
}
