package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(SecondOcurrence.secondSymbol("Hello world!!!", 'l'));
        System.out.println(SecondOcurrence.secondSymbol("Hello world!!!", 'o'));
        System.out.println(SecondOcurrence.secondSymbol("Hello world!!!", 'A'));
        System.out.println(SecondOcurrence.secondSymbol("", 'q'));
        System.out.println(SecondOcurrence.secondSymbol("Hello", '!'));
    }
}