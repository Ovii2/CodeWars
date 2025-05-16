package org.example;

public class Bud {
    public static String computerToPhone(String number) {
        StringBuilder result = new StringBuilder();

        for (var s : number.toCharArray()) {
            switch (s) {
                case '1' -> result.append("7");
                case '2' -> result.append("8");
                case '3' -> result.append("9");
                case '4' -> result.append("4");
                case '5' -> result.append("5");
                case '6' -> result.append("6");
                case '7' -> result.append("1");
                case '8' -> result.append("2");
                case '9' -> result.append("3");
                case '0' -> result.append("0");
                default -> throw new IllegalStateException("Unexpected value: " + number);
            }
        }
        return result.toString();
    }
}
