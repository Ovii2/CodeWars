package org.example;

public class Main {
    static void main() {
        IO.println(Kata.findNeedle(new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false}));
        IO.println(Kata.findNeedle(new Object[]{"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"}));
    }
}
