package org.example;

public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        return switch (operation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "/" -> numberTwo != 0 ? numberOne / numberTwo : null;
            case "*" -> numberOne < 0 ? Math.abs(numberOne * numberTwo) : numberOne * numberTwo;
            default -> null;
        };
    }
}
