package org.example;

public class Kata {
    public static int citySurfaceArea(int[][] map) {
        int result = 0;

        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                int currentHeight = map[row][column];

                int up = (row == 0) ? 0 : map[row - 1][column];
                int down = (row == map.length - 1) ? 0 : map[row + 1][column];
                int left = (column == 0) ? 0 : map[row][column - 1];
                int right = (column == map[row].length - 1) ? 0 : map[row][column + 1];

                if (currentHeight == 0) {
                    result += 1;
                } else {
                    result += 1;

                    result += Math.max(0, currentHeight - up);
                    result += Math.max(0, currentHeight - down);
                    result += Math.max(0, currentHeight - left);
                    result += Math.max(0, currentHeight - right);
                }
            }
        }
        return result;
    }
}
