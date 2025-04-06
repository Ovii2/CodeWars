package org.example;

public class Sqaure {
    public static boolean isSquare(int n) {
        if (n == 0) return true;
        if (n < 0) return false;
        double sqrt = (Math.sqrt(n));
        return sqrt % 1 == 0;
    }
}
