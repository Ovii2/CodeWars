package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(EANValidator.validate("9783815820865"));
        System.out.println(EANValidator.validate("9783815820864"));
        System.out.println(EANValidator.validate("9783827317100"));
        System.out.println(EANValidator.validate("400330101839"));
        System.out.println(EANValidator.validate("4003301018392"));
    }
}