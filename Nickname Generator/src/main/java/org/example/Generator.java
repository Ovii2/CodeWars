package org.example;

import java.util.List;

public class Generator {
    public static String nickname(String name) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        return vowels.contains(name.charAt(2)) ? name.substring(0, 4) : name.substring(0, 3);
    }
}
