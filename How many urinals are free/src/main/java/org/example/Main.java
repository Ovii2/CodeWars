package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(FreeUrinals.getFreeUrinals("10001"));
        System.out.println(FreeUrinals.getFreeUrinals("1001"));
        System.out.println(FreeUrinals.getFreeUrinals("00000"));
        System.out.println(FreeUrinals.getFreeUrinals("0000"));
        System.out.println(FreeUrinals.getFreeUrinals("01000"));
    }
}