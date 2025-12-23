package org.example;

public class Main {
    static void main() {
        IO.println(GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
        IO.println(GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
        IO.println(GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
        IO.println(GoodVsEvil.battle("7868 5724 6369 44 1429 8587", "6830 9172 1773 6705 884 1528 5522"));
    }
}
