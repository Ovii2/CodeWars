package org.example;

public class Geometry {
    public static double squareArea(double a) {
        double r = (2 * a) / Math.PI;
        double area = r * r;
        return Double.parseDouble("%.2f".formatted(area));
    }
}
