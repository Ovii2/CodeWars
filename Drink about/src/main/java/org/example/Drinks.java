package org.example;

public class Drinks {
    public static String peopleWithAgeDrink(int age) {
        return age < 14 ? "drink toddy"
                : age < 18 ? "drink coke"
                : age < 21 ? "drink beer"
                : "drink whisky";
    }
}
