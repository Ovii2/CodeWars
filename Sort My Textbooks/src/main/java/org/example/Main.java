package org.example;

import java.util.Arrays;

public class Main {
    static void main() {
        IO.println(Sorter.sort(Arrays.asList("Algebra", "English", "Geometry", "History")));
        IO.println(Sorter.sort(Arrays.asList("Algebra", "english", "Geometry", "History")));
        IO.println(Sorter.sort(Arrays.asList("$istory", "**English", "Alg#bra", "Geom^try")));
    }
}
