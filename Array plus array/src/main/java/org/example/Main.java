package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println((Sum.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println((Sum.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6})));
        System.out.println((Sum.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6})));
    }
}