package org.example;

import java.util.stream.IntStream;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int[] goodWorth = {1, 2, 3, 3, 4, 10};
        int[] badWorth = {1, 2, 2, 2, 3, 5, 10};
        int goodPower = calcBattlePower(goodAmounts, goodWorth);
        int badPower = calcBattlePower(evilAmounts, badWorth);
        return goodPower > badPower ? "Battle Result: Good triumphs over Evil"
                : badPower > goodPower ? "Battle Result: Evil eradicates all trace of Good"
                : "Battle Result: No victor on this battle field";
    }

    public static int calcBattlePower(String amount, int[] worth) {
        String[] splitAmounts = amount.split(" ");
        return IntStream.range(0, splitAmounts.length)
                .map(i -> Integer.parseInt(splitAmounts[i]) * worth[i])
                .sum();
    }
}
