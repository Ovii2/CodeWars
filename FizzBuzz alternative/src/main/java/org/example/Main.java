package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = scanner.nextInt();

        IntStream.rangeClosed(1, n)
                .mapToObj(i -> {
                    if (i % 3 == 0 && i % 5 == 0) {
                        return "FizzBuzz... ";
                    } else if (i % 3 == 0) {
                        return "Fizz... ";
                    } else if (i % 5 == 0) {
                        return "Buzz... ";
                    } else {
                        return i + " ";
                    }
                })
                .forEach(System.out::print);

        scanner.close();
    }
}