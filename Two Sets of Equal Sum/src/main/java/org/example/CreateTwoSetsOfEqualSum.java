package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateTwoSetsOfEqualSum {
    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
        long sum = (long) n * (n + 1) / 2;

        if (sum % 2 != 0) {
            return List.of(Collections.emptyList(), Collections.emptyList());
        }

        long target = sum / 2;

        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();

        for (int i = n; i >= 1; i--) {
            if (i <= target) {
                set1.add(i);
                target -= i;
            } else {
                set2.add(i);
            }
        }

        Collections.sort(set1);
        Collections.sort(set2);

        final List<List<Integer>> sets = new ArrayList<>();
        sets.add(set1);
        sets.add(set2);

        return sets;
    }
}
