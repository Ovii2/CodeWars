package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(TipCalculator.calculateTip(30, "Poor"));
        System.out.println(TipCalculator.calculateTip(20, "Excellent"));
        System.out.println(TipCalculator.calculateTip(30, "hi"));
        System.out.println(TipCalculator.calculateTip(107.65, "GReat"));
    }
}