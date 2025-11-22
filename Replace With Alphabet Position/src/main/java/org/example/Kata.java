package org.example;

public class Kata {
    static String alphabetPosition(String text) {
        String cleaned = text.toLowerCase().replaceAll("[^a-z]", "");
        String[] chars = cleaned.isEmpty() ? new String[0] : cleaned.split("");

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();

        for (String c : chars) {
            result.append(alphabet.indexOf(c) + 1).append(" ");
        }
        return result.toString().trim();
    }
}
