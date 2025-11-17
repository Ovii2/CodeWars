package org.example;


import java.time.LocalDate;

public class Main {
    static void main() {
        IO.println(Kata.getVillianName(LocalDate.of(2000, 01, 01)));
        IO.println(Kata.getVillianName(LocalDate.of(2000, 02, 02)));
        IO.println(Kata.getVillianName(LocalDate.of(2000, 12, 02)));
    }
}
