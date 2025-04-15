package org.example;

public class Kata {
    public static boolean consecutiveDucks(int n) {
        return (n & (n - 1)) != 0;
    }
}