package org.example;

public class Solution {
    public static int shiftLeft(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 && j >= 0 && a.charAt(i) == b.charAt(j)) {
            i--;
            j--;
        }
        return i + 1 + j + 1;
    }
}
