package org.example;

import java.util.Arrays;

public class Main {
    static void main() {
        IO.println(Arrays.toString(Kata.capMe(new String[]{"jo", "nelson", "jurie" })));
        IO.println(Arrays.toString(Kata.capMe(new String[]{"KARLY", "DANIEL", "KELSEY" })));
        IO.println(Arrays.toString(Kata.capMe(new String[]{"", "", "" })));
    }
}
