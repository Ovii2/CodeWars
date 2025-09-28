package org.example;

public class Main {
    static void main() {
        IO.println(Calculator.calculate(2, "+", 4));
        IO.println(Calculator.calculate(6, "-", 1.5));
        IO.println(Calculator.calculate(-4, "*", 8));
        IO.println(Calculator.calculate(49, "/", -7));
        IO.println(Calculator.calculate(8, "m", 2));
        IO.println(Calculator.calculate(4, "/", 0));
        IO.println(Calculator.calculate(-3, "*", 0));
    }
}
