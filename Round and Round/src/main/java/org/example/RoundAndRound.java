package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundAndRound {
    public static double roundTo2DecimalPlaces(double number) {
//        return Double.parseDouble("%.2f".formatted(number));
        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
