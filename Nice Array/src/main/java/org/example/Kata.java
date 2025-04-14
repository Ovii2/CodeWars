package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kata {
    public static boolean isNice(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>(List.of(arr));
        for (var n : arr) {
            if (!(set.contains(n - 1) || set.contains(n + 1))) {
                return false;
            }
        }
        return true;
    }
}
