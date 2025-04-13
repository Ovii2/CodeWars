package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Poet.pendulum(new int[]{6, 6, 8, 5, 10})));
        System.out.println(Arrays.toString(Poet.pendulum(new int[]{-9, -2, -10, -6})));
        System.out.println(Arrays.toString(Poet.pendulum(new int[]{11, -16, -18, 13, -11, -12, 3, 18})));
    }
}