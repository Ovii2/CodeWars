package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Counter.countSheeps(new Boolean[]{true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true}));
        System.out.println(Counter.countSheeps(new Boolean[]{false, null, true, false, null, null, true}));
    }
}