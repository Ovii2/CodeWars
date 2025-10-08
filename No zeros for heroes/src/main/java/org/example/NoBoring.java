package org.example;

public class NoBoring {
    public static int noBoringZeros(int n) {
        return n != 0 ? Integer.parseInt(String.valueOf(n).replaceAll("0+$", "")) : 0;
    }
}
