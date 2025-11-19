package org.example;

public class Carboat {
    public static String howmuch(int m, int n) {
        StringBuilder sb = new StringBuilder("[");
        int low = Math.min(m, n);
        int high = Math.max(m, n);
        for (int f = low; f <= high; f++) {
            if ((f - 1) % 9 == 0 && (f - 2) % 7 == 0) {
                int carPrice = (f - 1) / 9;
                int boatPrice = (f - 2) / 7;
                sb.append("[M: %d B: %d C: %d]".formatted(f, boatPrice, carPrice));
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
