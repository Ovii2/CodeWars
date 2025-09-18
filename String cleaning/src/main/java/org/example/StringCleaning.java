package org.example;

public class StringCleaning {
    static String stringClean(final String text) {
        return text.replaceAll("[0-9]","");
    }
}
