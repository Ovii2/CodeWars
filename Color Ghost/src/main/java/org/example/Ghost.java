package org.example;

import java.util.Random;

public class Ghost {

    private String color;
    String[] colors = {"white", "yellow", "purple", "red"};

    public Ghost() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        this.color = colors[index];
    }

    public String getColor() {
        return color;
    }
}
