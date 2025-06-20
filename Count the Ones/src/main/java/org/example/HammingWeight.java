package org.example;

public class HammingWeight {
    public static int hammingWeight(int i) {
        return Integer.toBinaryString(i).replace("0", "").length();
    }
}
