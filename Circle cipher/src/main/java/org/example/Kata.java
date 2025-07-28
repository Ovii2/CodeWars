package org.example;

public class Kata {
    public static String encode(String s) {
        StringBuilder encoded = new StringBuilder();
        int start = 0;
        int end = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                encoded.append(s.charAt(start));
                start++;
            } else {
                encoded.append(s.charAt(end));
                end--;
            }
        }

        return encoded.toString();
    }

    public static String decode(String s) {
        char[] result = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result[left] = s.charAt(i);
                left++;
            } else {
                result[right] = s.charAt(i);
                right--;
            }
        }
        return new String(result);
    }
}
