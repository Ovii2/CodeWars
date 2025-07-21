package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(TotalPoints.points(new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
        System.out.println(TotalPoints.points(new String[]{"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}));
    }
}