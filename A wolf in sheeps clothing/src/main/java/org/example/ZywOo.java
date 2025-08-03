package org.example;

public class ZywOo {
    public static String warnTheSheep(String[] array) {
        int wolfindex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals("wolf")) {
                wolfindex = i;
            }
        }
        int position = array.length - 1 - wolfindex;
        return position == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + position + "! You are about to be eaten by a wolf!";
    }
}
