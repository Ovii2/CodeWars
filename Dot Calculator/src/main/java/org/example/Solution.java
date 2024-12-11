package org.example;

public class Solution {
    public static String calc(String txt) {

        String[] parts = txt.split(" ");

        String part1 = parts[0];
        String operator = parts[1];
        String part2 = parts[2];

        int num1 = part1.length();
        int num2 = part2.length();

        int result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "//" -> num1 / num2;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
        return ".".repeat(result);
    }
}
