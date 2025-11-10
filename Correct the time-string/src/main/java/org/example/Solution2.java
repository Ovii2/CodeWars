package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Solution2 {
    public static String timeCorrect(String timestring) {
        if (timestring == null) {
            return null;
        }

        if (timestring.isEmpty()) {
            return "";
        }

        if (!timestring.matches("^\\d{2}:\\d{2}:\\d{2}$")) {
            return null;
        }
        String[] parts = timestring.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        LocalTime time = LocalTime.MIDNIGHT
                .plusHours(hours)
                .plusMinutes(minutes)
                .plusSeconds(seconds);

        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }
}

