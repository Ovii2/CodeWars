package org.example;

import java.util.List;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(Integer.class::isInstance)
                .toList();
    }
}
