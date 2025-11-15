package org.example;

public class BubblesortOnce {
    public static int[] bubbleSortOnce(int[] array) {
        int[] sorted = array.clone();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < sorted.length - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }
}
