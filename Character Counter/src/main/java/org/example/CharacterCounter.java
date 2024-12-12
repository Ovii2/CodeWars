package org.example;

import java.util.HashMap;

public class CharacterCounter {
    public static boolean validateWord(String word) {
        word = word.toLowerCase();
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : word.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        int expectedCount = -1;
        for (int count : charCounts.values()) {
            if (expectedCount == -1) {
                expectedCount = count;
            } else if (count != expectedCount) {
                return false;
            }
        }

        return true;
    }
}
