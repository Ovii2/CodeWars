package org.example;

public class Kata {
    public static String datingRange(int age) {
        int min = (int) Math.floor(((double) age / 2) + 7);
        int max = (int) Math.floor((double) (age - 7) * 2);

        if (age <= 14) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
        }
        return String.format("%d-%d", min, max);
    }
}
