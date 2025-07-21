package org.example;

public class TotalPoints {
    public static int points(String[] games) {
        int result = 0;

        for (int i = 0; i < games.length; i++) {
            String[] parts = games[i].split(":");
            int left = Integer.parseInt(parts[0]);
            int right = Integer.parseInt(parts[1]);

            if (left > right) {
                result += 3;
            } else if (right == left) {
                result += 1;
            } else {
                result += 0;
            }
        }
        return result;
    }
}
