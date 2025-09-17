package org.example;

public class Kata {
    public static String sumStr(String a, String b) {
        return a == "" && b == "" ? "0" :
                a == "" ? String.valueOf(Integer.parseInt(b) + Integer.parseInt("0")) :
                        b == "" ? String.valueOf(Integer.parseInt(a) + Integer.parseInt("0")) :
                                String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
