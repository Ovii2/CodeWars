package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.distinct(new int[]{1, 1, 2})));
        System.out.println(Arrays.toString(Solution.distinct(new int[]{1, 2, 1, 1, 3, 2})));
    }
}