package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(RegexValidation.validateTime("01:00"));
        System.out.println(RegexValidation.validateTime("1:00"));
        System.out.println(RegexValidation.validateTime("24:00"));
    }
}