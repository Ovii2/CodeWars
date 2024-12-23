package org.example;

public class Kata {
    public static int sumTriangularNumbers(int n) {
        if (n < 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * (i + 1) / 2;
        }
        return sum;
    }
}
