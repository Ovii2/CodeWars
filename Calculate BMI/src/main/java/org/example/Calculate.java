package org.example;

public class Calculate {
    public static String bmi(double weight, double height) {
        double total = (weight / (height * height));
        return total <= 18.5 ? "Underweight" : total <= 25.0
                ? "Normal" : total <= 30
                ? "Overweight" : "Obese";
    }
}
