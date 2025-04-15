package org.example;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] vowelIndices(String word) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            switch (word.toLowerCase().charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'y' -> list.add(i + 1);
                default -> { /* */ }
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
