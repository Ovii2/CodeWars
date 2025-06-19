package org.example;

public class Kata {
    static String greet(String name, String owner) {
        return String.format("Hello %s", name.equals(owner) ? "boss" : "guest");
    }
}
