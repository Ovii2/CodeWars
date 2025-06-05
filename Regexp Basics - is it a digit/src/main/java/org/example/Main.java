package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.isDigit(""));
        System.out.println(StringUtils.isDigit("7"));
        System.out.println(StringUtils.isDigit(" "));
        System.out.println(StringUtils.isDigit("a"));
        System.out.println(StringUtils.isDigit("a5"));
    }
}
