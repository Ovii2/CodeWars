package org.example;

public class PizzaPayments {
    public static double michaelPays(double cost) {
        double katePay;
        double katesBudget = 10.0;
        if (cost <= 5) {
            return (double) Math.round(cost * 100) / 100;
        } else {
            katePay = Math.min(cost / 3, katesBudget);
        }
        return (double) Math.round((cost - katePay) * 100) / 100;
    }
}
