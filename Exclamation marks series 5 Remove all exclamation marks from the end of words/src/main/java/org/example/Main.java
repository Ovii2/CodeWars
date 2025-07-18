package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(R.removeBang("Hi!"));
        System.out.println(R.removeBang("Hi!!!"));
        System.out.println(R.removeBang("!Hi"));
        System.out.println(R.removeBang("!Hi!"));
        System.out.println(R.removeBang("Hi! Hi!"));
        System.out.println(R.removeBang("!!!Hi !!hi!!! !hi"));
        System.out.println(R.removeBang("!!No! seriously! !Seriously!! !!Wow!"));
    }
}