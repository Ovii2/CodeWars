package org.example;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int days = 0;
        double limit = content * (threshold / 100);
        while (content > limit) {
            content *= (1 - evap_per_day / 100);
            days++;
        }
        return days;
    }
}
