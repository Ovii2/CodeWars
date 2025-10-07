package org.example;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v2 == 0 ? 0 : v1 / v2;
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };
    }
}
