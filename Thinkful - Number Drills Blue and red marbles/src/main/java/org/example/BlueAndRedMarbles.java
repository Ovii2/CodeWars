package org.example;

public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        int blueLeft = blueStart - bluePulled;
        int redLeft = redStart - redPulled;
        int totalLeft = blueLeft + redLeft;
        return (double) blueLeft / totalLeft;
    }
}
