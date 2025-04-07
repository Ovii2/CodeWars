package org.example;

public class Kata {
    public static String pattern(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append("1");
            for (int j = 1; j <= i - 1; j++) {
                result.append("*");
            }
            if (i > 1) {
                result.append(i);
            }
            if (i < n) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
