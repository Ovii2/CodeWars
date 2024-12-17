package org.example;

import java.util.Map;

public class Kata {
    public static int fourSeven(int n) {
        return Map.of(4, 7, 7, 4).getOrDefault(n, 0);
    }
}
