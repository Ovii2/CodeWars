package org.example;

import java.util.List;

public class MixedSum {
    public int sum(List<?> mixed) {
        return mixed.stream()
                .mapToInt(i -> Integer.parseInt(String.valueOf(i)))
                .sum();
    }
}
