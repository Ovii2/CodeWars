package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.isLetter(""));
        System.out.println(StringUtils.isLetter("a"));
        System.out.println(StringUtils.isLetter("X"));
        System.out.println(StringUtils.isLetter("7"));
        System.out.println(StringUtils.isLetter("*"));
        System.out.println(StringUtils.isLetter("ab"));
        System.out.println(StringUtils.isLetter("a\n"));
    }
}