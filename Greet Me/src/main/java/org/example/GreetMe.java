package org.example;

public class GreetMe {
    public static String greet(String name) {
        return "Hello " + name.substring(0, 1).toUpperCase() + name.toLowerCase().substring(1) + "!";
    }
}
