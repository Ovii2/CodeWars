package org.example;

public class Kata {
    public static String longestWord(String wordString) {
        String[] wordArray = wordString.split(" ");
        String longestWord = " ";
        for (String s : wordArray) {
            if (s.length() >= longestWord.length()) {
                longestWord = s;
            }
        }
        return longestWord;
    }
}
