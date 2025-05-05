package org.example;

public class Solution {
    public static boolean isAlt(String word) {

        String vowels = "aeiou";

        for (int i = 1; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) >= 0 == vowels.indexOf(word.charAt(i - 1)) >= 0) {
                return false;
            }
        }
        return true;
    }
}