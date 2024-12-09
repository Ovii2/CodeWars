package org.example;

public class Kata {
    public static double fuelPrice(int litres, double pricePerLitre) {
        // your code here
        // Good luck with it!
        return Math.round(litres * (pricePerLitre - Math.min(litres / 2 * 0.05, 0.25)) * 100) / 100.0;
    }
}
