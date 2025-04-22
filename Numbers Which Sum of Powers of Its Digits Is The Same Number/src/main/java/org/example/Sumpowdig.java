package org.example;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Sumpowdig {
    public static long[] eqSumPowDig(long hmax, int exp) {

       return LongStream.rangeClosed(2, hmax)
                .filter(n -> digitPowerSum(n, exp) == n)
                .toArray();
    }

    private static long digitPowerSum(long n, int exp) {
        String[] number = Long.toString(n).split("");

        return Arrays.stream(number)
                .mapToLong(d -> (long) Math.pow(Integer.parseInt(d), exp))
                .sum();
    }
}
