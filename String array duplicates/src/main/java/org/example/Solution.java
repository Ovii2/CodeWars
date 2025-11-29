package org.example;

import java.util.Arrays;

public class Solution {
    public static String[] dup(String[] arr) {
        return Arrays.stream(arr)
                .map(i -> i.replaceAll("(.)\\1+", "$1"))
                .toArray(String[]::new);
    }
}
