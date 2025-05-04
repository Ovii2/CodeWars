package org.example;

public class StringSplit {
    public static String[] solution(String s) {
        return s.isEmpty() ? new String[0] : (s.length() % 2 == 0 ? s : s + "_").split("(?<=\\G..)");
    }
}
