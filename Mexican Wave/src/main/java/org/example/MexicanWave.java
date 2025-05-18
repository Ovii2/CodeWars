package org.example;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        char[] chars = str.toCharArray();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            result.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
        }

        return result.toArray(new String[0]);
    }
}
