package org.example;

public class Calculator {
    public static double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Unexpected value: " + op);
        };
    }
}
