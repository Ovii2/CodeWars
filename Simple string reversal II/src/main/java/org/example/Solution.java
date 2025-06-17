package org.example;

public class Solution {
    public static String solve(String s, int a, int b) {
        b = Math.min(b, s.length() - 1);

        String prefix = s.substring(0, a);
        String reversed = new StringBuilder(s.substring(a, b + 1)).reverse().toString();
        String suffix = s.substring(b + 1);

        return prefix + reversed + suffix;
    }
}
