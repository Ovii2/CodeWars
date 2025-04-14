package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.evenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
        System.out.println(Arrays.toString(Kata.evenNumbers(new int[]{-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26}, 2)));
        System.out.println(Arrays.toString(Kata.evenNumbers(new int[]{6, -25, 3, 7, 5, 5, 7, -3, 23}, 1)));
    }
}