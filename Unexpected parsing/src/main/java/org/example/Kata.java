package org.example;

import java.util.Map;

public class Kata {
    public static Map<String, String> getStatus(boolean isBusy) {
        return Map.of("status", isBusy ? "busy" : "available");
    }
}
