package org.example;

import java.util.Arrays;

public class Main {
    static void main() {
        IO.println(Arrays.toString(M2048.merge(new int[]{2, 0, 2, 2})));
        IO.println(Arrays.toString(M2048.merge(new int[]{2, 0, 2, 4})));
        IO.println(Arrays.toString(M2048.merge(new int[]{4, 4, 8, 16})));
        IO.println(Arrays.toString(M2048.merge(new int[]{16, 16, 0, 0})));
    }
}
