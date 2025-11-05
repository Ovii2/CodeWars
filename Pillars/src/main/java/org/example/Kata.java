package org.example;

public class Kata {
    public static int pillars(int numPill, int dist, int width) {
        int result;
        int distanceInCm = dist * 100;
        if (numPill <= 1) {
            return 0;
        }
        if (numPill == 2) {
            result = distanceInCm;
        } else {
            result = ((numPill - 1) * distanceInCm) + (numPill - 2) * width;
        }
        return result;
    }
}
