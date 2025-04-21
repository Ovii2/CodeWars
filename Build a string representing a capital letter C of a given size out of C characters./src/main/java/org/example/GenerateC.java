package org.example;

public class GenerateC {
    public static String generateC(int size) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < size; i++) {
            result.append("C".repeat(size * 5)).append("\n");
        }
        for (int i = 0; i < size * 3; i++) {
            result.append("C".repeat(size)).append("\n");
        }
        for (int i = 0; i < size; i++) {
            result.append("C".repeat(size * 5)).append("\n");

        }
        return result.toString().trim();
    }
}
