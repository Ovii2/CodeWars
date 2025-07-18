package org.example;

public class R {
    public static String removeBang(String str) {
        return str.replaceAll("!+(?=\\s|$)", "");
    }
}
