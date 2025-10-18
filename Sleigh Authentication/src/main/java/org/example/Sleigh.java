package org.example;

public class Sleigh {
    public static Boolean authenticate(String name, String password) {
        return "Santa Claus".equals(name) && "Ho Ho Ho!".equals(password);
    }
}
