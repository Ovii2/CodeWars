package org.example;

import java.util.Arrays;

public class Kata {
    public static String calculate(String str) {
        String[] parts = str.replace("plus", " +").replace("minus", " -").split(" ");
        return Integer.toString(Arrays.stream(parts).mapToInt(Integer::parseInt).sum());
    }
}