package org.example;

import java.util.Arrays;

public class Vowels {
    public static int getCount(String str) {
       return (int) Arrays.stream(str.split(""))
                .filter(i -> i.toLowerCase().matches("[aeiou]"))
                .count();
    }
}
