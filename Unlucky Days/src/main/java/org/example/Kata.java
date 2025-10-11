package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class Kata {
    public static int unluckyDays(int year) {
        return (int) IntStream.rangeClosed(1, 12)
                .filter(month -> LocalDate.of(year, month, 13).getDayOfWeek() == DayOfWeek.FRIDAY).count();
    }
}
