package org.example;

public class Main {
    static void main() {
        IO.println(Kata.rps("rock", "scissors"));
        IO.println(Kata.rps("scissors", "paper"));
        IO.println(Kata.rps("paper", "rock"));
    }
}
