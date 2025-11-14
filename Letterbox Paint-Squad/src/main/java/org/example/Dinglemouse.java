package org.example;

public class Dinglemouse {
    public static int[] paintLetterboxes(final int start, final int end) {
        int[] result = new int[10];
        for (int i = start; i <= end; i++) {
            if (i == 0) {
                result[0]++;
            }
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                result[digit]++;
                num /= 10;
            }
        }
        return result;
    }
}
