package org.example;

import static java.util.Comparator.comparing;

public class Solution {
    public static char solve(String s) {
        return (char) s.chars().sorted().boxed()
                .min(comparing(c -> s.lastIndexOf(c) - s.indexOf(c))).orElse(0).intValue();
    }
}
