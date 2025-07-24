package org.example;

public class SquarePi {
    int digits;
    private static final String PI_DIGITS =
            "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";

    public SquarePi(int digits) {
        this.digits = digits;
    }

    public int calculate() {
        int sumOfSquares = 0;
        for (int i = 0; i < digits; i++) {
            int digit = Character.getNumericValue(PI_DIGITS.charAt(i));
            sumOfSquares += digit * digit;
        }

        int result = 0;
        while (result * result < sumOfSquares) {
            result++;
        }

        return result;
    }
}
