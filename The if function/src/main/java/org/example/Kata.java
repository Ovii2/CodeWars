package org.example;

public class Kata {
    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        (Boolean.TRUE.equals(bool) ? func1 : func2).run();
    }
}
