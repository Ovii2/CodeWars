package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean isAllPossibilities(int[] arg) {
        Set<Integer> seen = new HashSet<>();

        if (arg.length == 0) {
            return false;
        }

        for (var n : arg) {
            if (n < 0 || n >= arg.length) {
                return false;
            }
            if (!seen.contains(n)) {
                seen.add(n);
            }
        }
        return seen.size() == arg.length;
    }
}
