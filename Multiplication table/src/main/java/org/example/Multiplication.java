package org.example;

public class Multiplication {
    public static int[][] multiplicationTable(int n) {
        int[][] result = new int[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                result[i - 1][j - 1] = i * j;
            }
        }
        return result;
    }
}
