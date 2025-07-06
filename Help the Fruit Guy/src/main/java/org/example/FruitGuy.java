package org.example;

import java.util.Arrays;

public class FruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {

        return fruitBasket != null ? Arrays.stream(fruitBasket)
                .map(i -> (i.replace("rotten", "")).toLowerCase())
                .toArray(String[]::new) : new String[]{};
    }
}