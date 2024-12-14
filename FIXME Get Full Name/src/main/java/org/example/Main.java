package org.example;

public class Main {
    public static void main(String[] args) {
        Dinglemouse dinglemouse = new Dinglemouse("Clint", "Eastwood");
        Dinglemouse dinglemouse1 = new Dinglemouse("CCC", "YYY");
        Dinglemouse dinglemouse2 = new Dinglemouse("", "");
        Dinglemouse dinglemouse3 = new Dinglemouse("BBB", "");
        Dinglemouse dinglemouse4 = new Dinglemouse("", "Eastwood");
        Dinglemouse dinglemouse5 = new Dinglemouse("Clint", "");


        System.out.println(dinglemouse.getFullName());
        System.out.println(dinglemouse1.getFullName());
        System.out.println(dinglemouse2.getFullName());
        System.out.println(dinglemouse3.getFullName());
        System.out.println(dinglemouse4.getFullName());
        System.out.println(dinglemouse5.getFullName());
    }
}