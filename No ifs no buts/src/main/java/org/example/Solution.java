package org.example;

public class Solution {

    public static String noIfsNoButs(int a, int b) {
        return switch (Integer.compare(a, b)) {
            case -1 -> String.format("%d is smaller than %d", a, b);
            case 0 -> String.format("%d is equal to %d", b, a);
            case 1 -> String.format("%d is greater than %d", a, b);
            default -> throw new IllegalStateException("Unexpected value");
        };
    }
}
