package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.removeUrlAnchor("www.codewars.com#about"));
        System.out.println(Kata.removeUrlAnchor("www.codewars.com?page=1"));
        System.out.println(Kata.removeUrlAnchor("www.codewars.com/katas/?page=1#about"));
    }
}