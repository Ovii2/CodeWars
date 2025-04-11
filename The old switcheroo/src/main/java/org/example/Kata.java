package org.example;

public class Kata {
    public static String vowel2Index(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            switch (s.toLowerCase().charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> result.append(i + 1);
                default -> result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
