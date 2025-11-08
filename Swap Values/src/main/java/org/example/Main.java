package org.example;

import java.util.Arrays;

public class Main {
    static void main() {
        Integer[] args = new Integer[]{1, 2};

        Swapper r = new Swapper(args);
        r.swapValues();
        IO.println(Arrays.toString(args));
    }
}
