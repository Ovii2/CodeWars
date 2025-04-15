package org.example;

public class Kata {
    public static int elevatorDistance(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            total += Math.abs(arr[i] - arr[i + 1]);
        }
        return total;
    }
}
