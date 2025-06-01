package org.example;

import java.math.BigInteger;

public class Kata {
    public static String incrementString(String str) {
        String numberPart = str.replaceAll(".*?(\\d*)$", "$1");
        String textPart = str.substring(0, str.length() - numberPart.length());

        if (numberPart.isEmpty()) {
            return String.format("%s1", str);
        }

        BigInteger incremented = new BigInteger(numberPart).add(BigInteger.ONE);
        return String.format("%s%0" + numberPart.length() + "d", textPart, incremented);
    }
}
