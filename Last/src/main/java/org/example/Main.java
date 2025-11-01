package org.example;

import java.util.Arrays;

public class Main {
    static void main() {
        IO.println(Solution.last(Arrays.asList(1, 2, 3, 4)));
        IO.println(Solution.last("xyz"));
        IO.println(Solution.last(1, 2, 3, 4));
        IO.println(Arrays.toString(Solution.last(new int[]{1, 2, 3, 4})));
    }
}
