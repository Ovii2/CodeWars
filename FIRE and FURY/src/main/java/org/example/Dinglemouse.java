package org.example;

public class Dinglemouse {
    public static String fireAndFury(String tweet) {
        if (!tweet.matches("[EFIRUY]*")) {
            return "Fake tweet.";
        }
        String r = "";

        while (!tweet.isEmpty()) {
            if (tweet.startsWith("FIRE")) {
                r = r.endsWith("d!") ? r.substring(0, r.length() - 10) + "and you are fired!" : r + " You are fired!";
            } else if (tweet.startsWith("FURY")) {
                r = r.endsWith("s.") ? r.substring(0, r.length() - 8) + "really furious." : r + " I am furious.";
            }

            tweet = tweet.substring(1);
        }

        return r.isEmpty() ? "Fake tweet." : r.trim();
    }
}