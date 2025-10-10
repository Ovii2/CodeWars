package org.example;

public class DayOfWeek {
    public static String getDay(int n) {
        return switch (n) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Wrong, please enter a number between 1 and 7";
        };
    }
}
