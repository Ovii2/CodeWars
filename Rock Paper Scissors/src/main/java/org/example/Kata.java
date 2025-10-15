package org.example;

public class Kata {
    public static String rps(String p1, String p2) {
        return p1.equalsIgnoreCase(p2) ? "Draw!" :
                (p1.equalsIgnoreCase("rock") && p2.equalsIgnoreCase("scissors")) ||
                        (p1.equalsIgnoreCase("scissors") && p2.equalsIgnoreCase("paper")) ||
                        (p1.equalsIgnoreCase("paper") && p2.equalsIgnoreCase("rock")) ?
                        "Player 1 won!" : "Player 2 won!";
    }
}
