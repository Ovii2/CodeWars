package org.example;

import java.util.Locale;

public class NthSeries {
    public static String seriesSum(int n) {
        double sum = 0.0;
        double denominator;
        if (n == 0) {
            return "0.00";
        }
        for (int i = 0; i < n; i++) {
            denominator = 1 + (i * 3);
            sum += 1.0 / denominator;
        }
        return String.format(Locale.US, "%.2f", sum);
    }
}
