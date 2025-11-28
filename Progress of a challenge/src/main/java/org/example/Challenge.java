package org.example;

import java.util.Map;

public class Challenge {
    public static String checkChallenge(int pledged, int current, String month) {
        Map<String, Integer> map = Map.ofEntries(
                Map.entry("January", 0),
                Map.entry("February", 1),
                Map.entry("March", 2),
                Map.entry("April", 3),
                Map.entry("May", 4),
                Map.entry("June", 5),
                Map.entry("July", 6),
                Map.entry("August", 7),
                Map.entry("September", 8),
                Map.entry("October", 9),
                Map.entry("November", 10),
                Map.entry("December", 11)
        );

        int m = map.get(month);
        int base = pledged / 12;
        int remainder = pledged % 12;
        var expected = base * m + Math.min(remainder, m);
        var diff = current - expected;
        return current >= pledged ? "Challenge is completed." : diff == 0
                ? "You are on track." : diff > 0
                ? "You are %d ahead of schedule.".formatted(diff)
                : "You are %d behind schedule.".formatted(Math.abs(diff));
    }
}
