package org.example;

public class Correct {
    public static String correct(String string) {
        return string.replace("5", "S")
                .replace("0", "O")
                .replace("1", "I");
    }
}
