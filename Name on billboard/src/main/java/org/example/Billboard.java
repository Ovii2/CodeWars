package org.example;

public class Billboard {
    public static int billboard(String name, int price) {
        return Math.multiplyExact(name.length(), price);
    }
}
