package org.example;

import java.util.Arrays;

public class ArrayPrinter {
    public static String printArray(Object[] array) {
        return Arrays.toString(array).replaceAll("[\\[\\]\\s]+", "");
    }
}
