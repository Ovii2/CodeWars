package org.example;

public class Reduce {
    public static int[] myFraction(int[] fractions) {
        //your code here
        int result = fractions[0] / greatestCommonDivisor(fractions[0], fractions[1]);
        int result2 = fractions[1] / greatestCommonDivisor(fractions[0], fractions[1]);
        return new int[]{result, result2};
    }

    public static int greatestCommonDivisor(int n1, int n2) {
        return n2 == 0 ? n1 : greatestCommonDivisor(n2, n1 % n2);
    }
}
