package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static String solve(String str) {
        String[] parts = str.split("(?=[*/+-])|(?<=[*/+-])");
        Collections.reverse(Arrays.asList(parts));
        return String.join("", parts);
    }
}