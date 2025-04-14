package org.example;

public class FreeUrinals {
    public static int getFreeUrinals(String urinals) {
        if (urinals.contains("11")) {
            return -1;
        }
        char[] result = urinals.toCharArray();

        int count = 0;
        for (int i = 0; i < urinals.length(); i++) {
            if ((i == 0 || result[i - 1] == '0') && result[i] == '0' && (i == result.length - 1 || result[i + 1] == '0')) {
                count++;
                result[i] = '1';
            }
        }
        return count;
    }
}
