package org.example;

public class Solution {
    public static String explode(String digits) {
        StringBuilder sb = new StringBuilder();

        for (char c : digits.toCharArray()) {
            sb.append(String.valueOf(c).repeat(Character.getNumericValue(c)));
        }
        return sb.toString();
    }
}
