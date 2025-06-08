package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Greed.greedy(new int[]{2, 3, 4, 6, 2}));
        System.out.println(Greed.greedy(new int[]{4, 4, 4, 3, 3}));
        System.out.println(Greed.greedy(new int[]{2, 4, 4, 5, 4}));
        System.out.println(Greed.greedy(new int[]{5, 1, 3, 4, 1}));
        System.out.println(Greed.greedy(new int[]{1, 1, 1, 3, 1}));
    }
}