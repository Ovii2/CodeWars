package org.example;

public class Main {
    static void main() {
        IO.println(SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, -2, 12, -8}));
        IO.println(SmallestIntegerFinder.findSmallestInt(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}));
    }
}
