package org.example;

public class Kata {
    public static int[] getSize(int w, int h, int d) {
        int area = (2 * d * w) + (2 * d * h) + (2 * h * w);
        int volume = d * h * w;
        return new int[]{area, volume};
    }
}
