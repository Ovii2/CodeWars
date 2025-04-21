package org.example;

import java.util.List;

public class EightiesKids5 {
    public static String bucketOf(String said) {
        List<String> water = List.of("water", "wet", "wash", "washing", "watered");
        List<String> slime = List.of("i don't know", "slime");

        boolean isWater = water.stream()
                .anyMatch(w -> said.toLowerCase().contains(w));

        boolean isSlime = slime.stream()
                .anyMatch(w -> said.toLowerCase().contains(w));

        return isWater && isSlime ? "sludge"
                : isWater ? "water"
                : isSlime ? "slime"
                : "air";
    }
}
