package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Plural.isPlural(0f));
        System.out.println(Plural.isPlural(0.5f));
        System.out.println(Plural.isPlural(1f));
        System.out.println(Plural.isPlural(100f));
    }
}