package org.example;

public class Dinglemouse {
    public static int kookaCounter(final String laughing) {
        return !laughing.isEmpty() ? laughing.replaceAll("(Ha)+", "M").replaceAll("(ha)+", "F").length() : 0;
    }
}
