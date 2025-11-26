package org.example;

public class M2048 {
    static int[] merge(int[] line) {
        int[] row = compactLeft(line);

        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && row[i] == row[i + 1]) {
                row[i] = row[i] + row[i + 1];
                row[i + 1] = 0;
            }
        }
        return compactLeft(row);
    }

    public static int[] compactLeft(int[] array) {
        int writeIndex = 0;
        int[] clone = new int[array.length];

        for (int i : array) {
            if (i != 0) {
                clone[writeIndex] = i;
                writeIndex++;
            }
        }
        return clone;
    }
}
