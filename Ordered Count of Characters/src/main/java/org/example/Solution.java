package org.example;

import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        return text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toMap(
                                c -> c,
                                c -> 1,
                                Integer::sum,
                                LinkedHashMap::new
                        ),
                        map -> map.entrySet().stream()
                                .map(e -> Pair.of(e.getKey(), e.getValue()))
                                .toList()
                ));
    }
}
