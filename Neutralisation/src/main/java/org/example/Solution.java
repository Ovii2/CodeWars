package org.example;

public class Solution {
    public static String neutralise(String s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            String pair = "" + s1.charAt(i) + s2.charAt(i);

            result.append(
                    switch (pair) {
                        case "++" -> '+';
                        case "--" -> '-';
                        case "+-", "-+" -> '0';
                        default -> '0';
                    }
            );
        }
        return result.toString();
    }
}
