package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Rotator {

    public static Object[] rotate(Object[] arr, int d) {
        Collections.rotate(Arrays.asList(arr), d);
        return arr;
    }
}
