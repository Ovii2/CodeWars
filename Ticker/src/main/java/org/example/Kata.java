package org.example;

public class Kata {
    public static String ticker(String text, int width, int tick) {
        String paddedText = " ".repeat(width) + text + " ".repeat(width);
        var currentTick = tick % (paddedText.length() - width);
        return paddedText.substring(currentTick, currentTick + width);
    }
}
