package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.invert(new int[]{-1, -2, -3, -4, -5})));
        System.out.println(Arrays.toString(Kata.invert(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(Kata.invert(new int[]{0})));
    }
}