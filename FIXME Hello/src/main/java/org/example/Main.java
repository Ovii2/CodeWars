package org.example;

public class Main {
    public static void main(String[] args) {
        Dinglemouse dinglemouse = new Dinglemouse().setName("Bob").setAge(27).setSex('M');
        System.out.println(dinglemouse.hello());

        System.out.println("-".repeat(20));

        Dinglemouse dinglemouse1 = new Dinglemouse().setAge(27).setSex('M').setName("Bob");
        System.out.println(dinglemouse1.hello());
    }
}