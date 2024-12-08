package org.example;

public class Converter {
    public static float mpgToKPM(final float mpg) {
        float gallonInLitres = 4.54609188f;
        float mileToKm = 1.609344f;
        float fuelEconomy = mpg * mileToKm / gallonInLitres;
        return Math.round(fuelEconomy  * 100) / 100f;
    }
}
