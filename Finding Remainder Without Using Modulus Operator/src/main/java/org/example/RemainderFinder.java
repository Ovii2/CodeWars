package org.example;

public class RemainderFinder {
    public static SimpleInteger remainder(SimpleInteger dividend, SimpleInteger divisor) {
        return dividend.subtract(dividend.divide(divisor).multiply(divisor));

    }
}
