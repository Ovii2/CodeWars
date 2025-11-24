package org.example;

public class Solution {
    public static String camelCase(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] words = str.strip().split("\\s+");
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
        }

        return sb.toString().trim();
    }
}
