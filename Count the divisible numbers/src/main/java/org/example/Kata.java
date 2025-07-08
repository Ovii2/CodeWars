package org.example;


public class Kata {
    public static long divisibleCount(long x, long y, long k) {
        return x % k == 0 ? (y / k - x / k + 1) : (y / k - x / k);
    }
}
