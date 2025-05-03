package org.example;


public class DRoot {
    public static int digital_root(int n) {
        return n < 10 ? n : digital_root(sumDigits(n));

    }

    public static int sumDigits(int number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
