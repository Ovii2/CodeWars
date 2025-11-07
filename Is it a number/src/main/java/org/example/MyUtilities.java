package org.example;

public class MyUtilities {
    public static boolean isDigit(String s) {
        return s.strip().matches("-?\\d+(\\.\\d+)?");
    }
}
