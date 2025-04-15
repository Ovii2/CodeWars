package org.example;

public class Kata {
    public static int calc(String x) {
        StringBuilder total1 = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            var charCode = (int) x.charAt(i);
            total1.append(charCode);
        }

        String total2 = String.valueOf(total1).replace("7", "1");
        return total1.toString().chars().map(Character::getNumericValue).sum() - total2.chars().map(Character::getNumericValue).sum();
    }
}
