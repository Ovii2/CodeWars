package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PancakeFlip {
    public static List<Integer> flipPancakes(List<Integer> stack) {
        List<Integer> pancakes = new ArrayList<>(stack);
        List<Integer> result = new ArrayList<>();

        for (int i = pancakes.size() - 1; i >= 1; i--) {
            int maxIndex = pancakes.subList(0, i + 1).indexOf(Collections.max(pancakes.subList(0, i + 1)));
            if (maxIndex == i) {
                continue;
            }
            if (maxIndex != 0) {
                Collections.reverse(pancakes.subList(0, maxIndex + 1));
                result.add(maxIndex);
            }
            Collections.reverse(pancakes.subList(0, i + 1));
            result.add(i);
        }
        result.removeIf(flip -> flip < 1);
        return result;
    }
}
