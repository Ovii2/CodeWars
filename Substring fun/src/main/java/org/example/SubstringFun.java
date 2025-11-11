package org.example;

public class SubstringFun {
    public static String nthChar(String[] words) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
           result.append(words[i].charAt(i));
        }

        return result.toString();
    }
}
