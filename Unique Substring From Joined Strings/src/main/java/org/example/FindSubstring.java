package org.example;

import java.util.HashSet;
import java.util.Set;

public class FindSubstring {
    static int longestSubstring(String a, String b) {
        String concatA = a + b;
        String concatB = b + a;
        Set<Character> forbidden = commonChars(a, b);

        int length1 = longestAllowedSubstringLength(concatA, forbidden);
        int length2 = longestAllowedSubstringLength(concatB, forbidden);

        return Math.max(length1, length2);
    }

    public static Set<Character> commonChars(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (Character c : s1.toCharArray()) {
            if (s2.indexOf(c) >= 0) {
                set.add(c);
            }
        }
        return set;
    }

    public static int longestAllowedSubstringLength(String s, Set<Character> forbidden) {
        int current = 0;
        int best = 0;
        for (Character c : s.toCharArray()) {
            if (forbidden.contains(c)) {
                current = 0;
            } else {
                current++;
                best = Math.max(current, best);
            }
        }
        return best;
    }
}
