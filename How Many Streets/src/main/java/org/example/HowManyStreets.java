package org.example;

import java.util.HashMap;
import java.util.Map;

public class HowManyStreets {

    public static int[] countStreets(String[] streets, String[][] drivers) {
        Map<String, Integer> streetIndices = new HashMap<>();
        for (int i = 0; i < streets.length; i++) {
            streetIndices.put(streets[i], i);
        }

        int[] results = new int[drivers.length];
        for (int i = 0; i < drivers.length; i++) {
            int startIndex = streetIndices.get(drivers[i][0]);
            int endIndex = streetIndices.get(drivers[i][1]);
            results[i] = Math.abs(endIndex - startIndex) - 1;
        }

        return results;
    }
}
