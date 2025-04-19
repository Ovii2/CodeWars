package org.example;

import java.time.LocalDate;

public class DateDays {
    public static String dateNbDays(double a0, double a, double p) {
        double percent = p / 36_000;
        int days = 0;

        while (a0 < a) {
            a0 += a0 * percent;
            days++;
        }
        return LocalDate.of(2016, 1, 1).plusDays(days).toString();
    }
}
