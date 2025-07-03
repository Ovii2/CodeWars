package org.example;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(RemainderFinder.remainder(new SimpleInteger(BigInteger.valueOf(10)), new SimpleInteger(BigInteger.valueOf(2))));
        System.out.println(RemainderFinder.remainder(new SimpleInteger(BigInteger.valueOf(34)), new SimpleInteger(BigInteger.valueOf(7))));
    }
}