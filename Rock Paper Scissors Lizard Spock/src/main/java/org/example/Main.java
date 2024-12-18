package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.rpsls("rock", "lizard"));
        System.out.println(Kata.rpsls("paper", "rock"));
        System.out.println(Kata.rpsls("scissors", "lizard"));
        System.out.println(Kata.rpsls("lizard", "paper"));
        System.out.println(Kata.rpsls("spock", "rock"));
        System.out.println();
        System.out.println(Kata.rpsls("lizard", "scissors"));
        System.out.println(Kata.rpsls("spock", "lizard"));
        System.out.println(Kata.rpsls("paper", "lizard"));
        System.out.println(Kata.rpsls("scissors", "spock"));
        System.out.println(Kata.rpsls("rock", "spock"));
    }
}