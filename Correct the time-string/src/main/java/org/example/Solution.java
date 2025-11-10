package org.example;

public class Solution {
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


        String[] timeParts = timestring.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);

        int[] secondsResult = normalizeTimeInput(minutes, seconds);
        int updatedMinutesAfterSeconds = secondsResult[0];
        int normalizedSeconds = secondsResult[1];

        int[] minutesResult = normalizeTimeInput(hours, updatedMinutesAfterSeconds);
        int updatedHoursAfterMinutes = minutesResult[0];
        int normalizedMinutes = minutesResult[1];

        int normalizedHours = normalizeHours(updatedHoursAfterMinutes);

        return "%02d:%02d:%02d".formatted(normalizedHours, normalizedMinutes, normalizedSeconds);
    }

    public static int normalizeHours(int hours) {
        return hours % 24;
    }

    public static int[] normalizeTimeInput(int higherUnit, int lowerUnit) {
        int delta = lowerUnit / 60;
        int normalizedInput = lowerUnit % 60;
        int updatedInput = higherUnit + delta;
        return new int[]{updatedInput, normalizedInput};
    }
}
