package org.example;

import java.util.Arrays;

public class Main {
    static void main() {
        IO.println(Arrays.toString(Multiples.find(5, 25)));
        IO.println(Arrays.toString(Multiples.find(1, 2)));
        IO.println(Arrays.toString(Multiples.find(4, 27)));
    }
}
