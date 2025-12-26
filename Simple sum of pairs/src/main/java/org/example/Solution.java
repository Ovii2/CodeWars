package org.example;

public class Solution {
    public static int solve(long n) {
        long a = getACandidate(n);
        long b = n - a;
        return sumDigits(a) + sumDigits(b);
    }

    private static long getACandidate(long n) {
        if (n < 9) {
            return 0;
        }
        long aCandidate = 9;
        while (aCandidate * 10 + 9 <= n) {
            aCandidate = aCandidate * 10 + 9;
        }
        return aCandidate;
    }

    public static int sumDigits(long num) {
        return String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
