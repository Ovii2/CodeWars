package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kata {
    public static String rpsls(String player1, String player2) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("scissors", List.of("paper", "lizard"));
        map.put("paper", List.of("rock", "spock"));
        map.put("rock", List.of("lizard", "scissors"));
        map.put("spock", List.of("scissors", "rock"));
        map.put("lizard", List.of("spock", "paper"));
        if (map.get(player1).contains(player2)) {
            return "Player 1 Won!";
        }
        if (map.get(player2).contains(player1)) {
            return "Player 2 Won!";
        }
        return "Draw!";
    }
}
