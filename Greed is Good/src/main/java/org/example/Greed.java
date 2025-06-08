package org.example;

import java.util.Arrays;

public class Greed {
    public static int greedy(int[] dice) {
        int[] diceCopy = Arrays.copyOf(dice, dice.length);
        int[] count = new int[6];

        for (int value : diceCopy) {
            count[value - 1]++;
        }

        int score = 0;

        for (int i = 0; i < 6; i++) {
            if (count[i] >= 3) {
                switch (i + 1) {
                    case 1 -> score += 1000;
                    case 2 -> score += 200;
                    case 3 -> score += 300;
                    case 4 -> score += 400;
                    case 5 -> score += 500;
                    case 6 -> score += 600;
                }
                count[i] -= 3;
            }
        }
        score += count[0] * 100;
        score += count[4] * 50;
        return score;
    }
}
