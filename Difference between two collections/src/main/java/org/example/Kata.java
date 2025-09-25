package org.example;

import java.util.*;
import java.util.stream.*;

public class Kata {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        return Stream.concat(
                        a.stream().filter(c -> !b.contains(c)),
                        b.stream().filter(c -> !a.contains(c)))
                .distinct()
                .sorted()
                .toList();
    }
}
