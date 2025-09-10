package org.example;

import java.math.BigInteger;

public class Easyline {
    public static BigInteger easyLine(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf((long) n + i));
            result = result.divide(BigInteger.valueOf(i));
        }
        return result;
    }
}
