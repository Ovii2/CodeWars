package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);
        System.out.println(MyLanguages.myLanguages(map1));
        System.out.println("-".repeat(20));
        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);
        System.out.println(MyLanguages.myLanguages(map2));
        System.out.println("-".repeat(20));
        final Map<String, Integer> map3 = new HashMap<>();
        map3.put("C++", 50);
        map3.put("ASM", 10);
        map3.put("Haskell", 20);
        System.out.println(MyLanguages.myLanguages(map3));
        System.out.println("-".repeat(20));
    }
}