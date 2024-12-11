package org.example;

public class Main {
    public static void main(String[] args) {
        Drinkin drinkin = new Drinkin();
        System.out.println(drinkin.hydrate("1 glass of wine"));
        System.out.println(drinkin.hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));
    }
}