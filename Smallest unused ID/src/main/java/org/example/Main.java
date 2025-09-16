package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.nextId(new int[]{0, 1, 2, 3, 5}));
        System.out.println(Kata.nextId(new int[]{1, 2, 0, 2, 3}));
        System.out.println(Kata.nextId(new int[]{1, 2, 0, 2, 3, 5}));
        System.out.println(Kata.nextId(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}