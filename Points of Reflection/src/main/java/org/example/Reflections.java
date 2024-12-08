package org.example;

public class Reflections {
    public static int[] reflectPoint(int[] p, int[] q) {
        int deltaX = p[0] - q[0];
        int deltaY = p[1] - q[1];
        int p1X = q[0] + deltaX * -1;
        int p1Y = q[1] + deltaY * -1;

        return new int[]{p1X, p1Y};
    }
}
