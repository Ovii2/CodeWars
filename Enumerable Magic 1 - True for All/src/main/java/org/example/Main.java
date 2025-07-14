package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Solution.all(numbers, n -> n < 9));
        System.out.println(Solution.all(numbers, n -> n > 9));
    }
}