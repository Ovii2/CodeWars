package org.example;

import java.util.Arrays;

public class Solution {
    public static String camelCase(String input) {
        return Arrays.toString(input.split("(?=\\p{Lu})")).replaceAll("[,\\[\\]]", "");
    }
}
