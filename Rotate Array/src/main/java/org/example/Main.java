package org.example;

import java.util.Arrays;

public class Main {
    static void main() {
        IO.println(Arrays.toString(Rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 1)));
        IO.println(Arrays.toString(Rotator.rotate(new Object[]{1, 2, 3, 4, 5}, 2)));
        IO.println(Arrays.toString(Rotator.rotate(new Object[]{1, 2, 3, 4, 5}, -1)));
    }
}
