package org.example;

public class Kata {
    public static int multiply(int number) {
        int count = countDigits(number);
        return (int) (number * Math.pow(5, count));
    }

    public static int countDigits(int n) {
        return Long.toString(Math.abs(n)).length();
    }
}
