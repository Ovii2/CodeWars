package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet().stream()
                .filter(s -> s.getValue() >= 60)
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .toList();
    }
}
