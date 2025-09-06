package org.example;

public class Kata {
    public static int[] digitize(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .toString()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
