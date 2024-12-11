package org.example;

public class Drinkin {
    public String hydrate(String drinkString) {
        String[] numbers = drinkString.replaceAll("[^0-9]", " ").trim().split("\\s+");

        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

        return String.format("%s glass%s of water", sum, sum > 1 ? "es" : "");
    }
}
