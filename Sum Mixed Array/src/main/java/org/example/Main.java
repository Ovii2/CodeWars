package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MixedSum mixedSum = new MixedSum();
        System.out.println(mixedSum.sum(Arrays.asList(5, "5")));
    }
}