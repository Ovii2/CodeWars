package org.example;

import java.util.Comparator;
import java.util.stream.Stream;

public class Kata {
    public static String[] lineupStudents(String students) {
        return Stream.of(students.split(" "))
                .sorted(Comparator.comparing(String::length).reversed()
                        .thenComparing(Comparator.reverseOrder()))
                .toArray(String[]::new);
    }
}
