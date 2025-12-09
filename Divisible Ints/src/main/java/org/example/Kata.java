package org.example;

public class Kata {

    public static int getCount(int n) {
        String str = String.valueOf(n);
        int count = 0;
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                int parsedInt = Integer.parseInt(substring);
                if ((parsedInt != 0) && (parsedInt != n) && (n % parsedInt == 0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
