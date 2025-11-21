package org.example;

public class Solution {
    public static int coins(int coin1, int coin2) {
        return gcd(coin1, coin2) > 1 ? -1 : computeLargestGap(coin1, coin2);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int computeLargestGap(int a, int b){
        return (a * b) - (a + b);
    }
}
