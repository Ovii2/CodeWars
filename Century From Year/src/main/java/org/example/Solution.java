package org.example;

public class Solution {
    public static int century(int number) {
        return number < 0 ? 0
                : number <= 100 ? 1
                : number % 100 == 0 ? number / 100
                : number / 100 + 1;
    }
}
