package org.example;

public class Kata {
    public static int cost(int mins) {
        int costPerHour = 30;
        int costPerSubsequentHour = 10;
        int extraMinutes = mins - 65;
        int halfHours = (extraMinutes + 29) / 30;
        int sum = 0;

        if (mins <= 65) {
            sum += costPerHour;
        } else {
            sum += 30 + (halfHours * costPerSubsequentHour);
        }
        return sum;
    }
}
