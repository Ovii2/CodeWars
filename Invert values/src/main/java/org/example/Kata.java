package org.example;

public class Kata {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[i] += Math.abs(array[i]);
            }
            if (array[i] > 0) {
                result[i] += Math.negateExact(array[i]);
            }
        }
        return result;
    }
}
