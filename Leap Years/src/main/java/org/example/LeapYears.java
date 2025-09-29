package org.example;

import java.time.Year;

public class LeapYears {
    public static boolean isLeapYear(int year) {
//        return (year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0);
        return Year.of(year).isLeap();
    }
}
