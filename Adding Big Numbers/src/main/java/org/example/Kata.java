package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Kata {
    public static String add(String a, String b) {
        a = a.replaceFirst("^0+(?!$)", "");
        b = b.replaceFirst("^0+(?!$)", "");

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        ArrayList<Character> result = new ArrayList<>();

        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int n2 = (j >= 0) ? b.charAt(j) - '0' : 0;
            int current = n1 + n2 + carry;
            carry = current / 10;
            current = current % 10;
            result.add((char) ('0' + current));
            i--;
            j--;
        }

        Collections.reverse(result);
        StringBuilder resultString = new StringBuilder(result.size());
        for (Character c : result) {
            resultString.append(c);
        }
        return resultString.toString();
    }
}