package org.example;

public class Kata {
    public static String multiTable(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int sum = i * num;
            if (i == 10) {
                result.append("%d * %d = %d".formatted(i, num, sum));
            } else {
                result.append("%d * %d = %d%n".formatted(i, num, sum));
            }
        }
        return result.toString();
    }
}
