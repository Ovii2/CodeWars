package org.example;

public class Kata {
    public static String catMouse(String x) {
        String dots = x.toLowerCase().replaceAll("[c-m]", "");
        return dots.length() <= 3 ? "Caught!" : "Escaped!";
    }
}