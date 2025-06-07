package org.example;

public class Palindromes {
    public static int palindromeChainLength(long n) {
        if (n == 0) {
            return 0;
        }
        int steps = 0;

        while (!isPalindrome(n)) {
            n += reverseNumber(n);
            steps++;
        }
        return steps;
    }

    public static boolean isPalindrome(long n) {
        String s = String.valueOf(n);
        return s.contentEquals(new StringBuilder(s).reverse());
    }

    public static long reverseNumber(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s).reverse();
        return Long.parseLong(String.valueOf(sb));
    }
}
