package org.example;

public class Dinglemouse {
    public static double cogRpm(final int[] cogs) {
        double rpm = 1.0;

        for (int i = 0; i < cogs.length - 1; i++) {
            rpm = -(rpm * ((double) cogs[i] / cogs[i + 1]));
        }
        return rpm;
    }
}
