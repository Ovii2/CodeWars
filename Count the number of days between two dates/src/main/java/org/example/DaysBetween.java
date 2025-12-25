package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetween {
    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(year2, month2, day2);

        return ChronoUnit.DAYS.between(date1, date2);
    }
}
