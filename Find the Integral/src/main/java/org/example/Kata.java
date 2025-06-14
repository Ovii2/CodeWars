package org.example;

public class Kata {
    public static String integrate(int coefficient, int exponent) {
        int integral = coefficient / ++exponent;
        return String.format("%dx^%d", integral, coefficient / integral);
    }
}
