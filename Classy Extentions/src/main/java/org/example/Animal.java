package org.example;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return this.name + " meows";
    }
}
