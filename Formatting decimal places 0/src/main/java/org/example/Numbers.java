package org.example;

public class Numbers {
    public static double twoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }
}
