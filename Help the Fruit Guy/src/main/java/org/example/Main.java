package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(FruitGuy.removeRotten(new String[]{"rottenApple", "rottenBanana", "rottenApple", "rottenPineapple", "rottenKiwi"})));
    }
}