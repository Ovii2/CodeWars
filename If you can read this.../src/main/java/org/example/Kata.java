package org.example;

public class Kata {
    public static String toNATO(String string) {
        StringBuilder result = new StringBuilder();
        String[] nato = {"Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett",
                "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform",
                "Victor", "Whiskey", "Xray", "Yankee", "Zulu"};

        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(nato[Character.toUpperCase(c) - 'A']).append(" ");
            } else if (c != ' ') {
                result.append(c).append(" ");
            }
        }
        return result.toString().trim();
    }
}
