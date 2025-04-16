package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.evenLast(new int[]{2, 3, 4, 5}));
        System.out.println(Kata.evenLast(new int[]{0}));
        System.out.println(Kata.evenLast(new int[]{2, 2, 2, 2}));
        System.out.println(Kata.evenLast(new int[]{1, 3, 3, 1, 10}));
        System.out.println(Kata.evenLast(new int[]{-11, 3, 3, 1, 10}));
    }
}