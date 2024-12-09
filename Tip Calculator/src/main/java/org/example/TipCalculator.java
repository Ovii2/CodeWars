package org.example;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        // tipPercentage tap
        return switch (rating.toLowerCase()) {
            case "terrible" -> 0;
            case "poor" -> (int) Math.ceil(amount * 0.05);
            case "good" -> (int) Math.ceil(amount * 0.1);
            case "great" -> (int) Math.ceil(amount * 0.15);
            case "excellent" -> (int) Math.ceil(amount * 0.2);
            default -> null;
        };
    }
}
