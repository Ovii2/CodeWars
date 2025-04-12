package org.example;

public class Kata {
    public static int sumDigits(int number) {
        return String.valueOf(Math.abs(number)).codePoints()
                .map(Character::getNumericValue)
                .sum();
    }
}
