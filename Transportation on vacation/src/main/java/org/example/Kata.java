package org.example;

public class Kata {
    public static int rentalCarCost(int d) {
        int pricePerDay = 40;
        int total;

        if (d >= 7) {
            total = (d * pricePerDay) - 50;
        } else if (d >= 3) {
            total = (d * pricePerDay) - 20;
        } else {
            total = d * pricePerDay;
        }
        return total;
    }
}
