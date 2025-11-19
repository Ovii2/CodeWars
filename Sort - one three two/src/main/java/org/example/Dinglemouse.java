package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dinglemouse {
    private static final Map<Integer, String> SMALL = new HashMap<>();
    private static final Map<Integer, String> TENS = new HashMap<>();

    static {
        // 0–19
        SMALL.put(0, "zero");
        SMALL.put(1, "one");
        SMALL.put(2, "two");
        SMALL.put(3, "three");
        SMALL.put(4, "four");
        SMALL.put(5, "five");
        SMALL.put(6, "six");
        SMALL.put(7, "seven");
        SMALL.put(8, "eight");
        SMALL.put(9, "nine");
        SMALL.put(10, "ten");
        SMALL.put(11, "eleven");
        SMALL.put(12, "twelve");
        SMALL.put(13, "thirteen");
        SMALL.put(14, "fourteen");
        SMALL.put(15, "fifteen");
        SMALL.put(16, "sixteen");
        SMALL.put(17, "seventeen");
        SMALL.put(18, "eighteen");
        SMALL.put(19, "nineteen");

        // tens
        TENS.put(2, "twenty");
        TENS.put(3, "thirty");
        TENS.put(4, "forty");
        TENS.put(5, "fifty");
        TENS.put(6, "sixty");
        TENS.put(7, "seventy");
        TENS.put(8, "eighty");
        TENS.put(9, "ninety");
    }

    public static int[] sort(final int[] array) {
        String[] words = new String[array.length];
        int[] numbers = new int[words.length];

        for (int i = 0; i < array.length; i++) {
            words[i] = toWords(array[i]);
        }

        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            numbers[i] = toNumbers(words[i]);
        }

        return numbers;
    }

    public static String toWords(int n) {
        if (n < 20) {
            return SMALL.get(n);
        }

        if (n < 100) {
            int tenParts = n / 10;
            int remainder = n % 10;

            if (remainder == 0) return TENS.get(tenParts);
            return TENS.get(tenParts) + " " + SMALL.get(remainder);
        }

        // 100–999
        int hundredsPart = n / 100;
        int remainder = n % 100;

        if (remainder == 0) return SMALL.get(hundredsPart) + " hundred";
        return SMALL.get(hundredsPart) + " hundred " + toWords(remainder);
    }

    public static int toNumbers(String s) {
        int total = 0;
        int current = 0;
        String[] parts = s.split(" ");

        for (String word : parts) {
            if (word.equals("hundred")) {
                current *= 100;
                continue;
            }

            if (SMALL.containsValue(word)) {
                for (var entry : SMALL.entrySet()) {
                    if (word.equals(entry.getValue())) {
                        current += entry.getKey();
                    }
                }
            }

            if (TENS.containsValue(word)) {
                for (var entry : TENS.entrySet()) {
                    if (word.equals(entry.getValue())) {
                        current += entry.getKey() * 10;
                    }
                }
            }
        }
        return total + current;
    }
}
