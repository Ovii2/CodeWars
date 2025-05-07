package org.example;

public class Kata {
    public static String[] oneTwoThree(int n) {
        if (n == 0) return new String[]{"0", "0"};
        if (n < 10) return new String[]{String.valueOf(n), "1".repeat(n)};

        StringBuilder number = new StringBuilder();

        while (n >= 9) {
            number.append('9');
            n -= 9;
        }

        if (n > 0) number.append(n);

        return new String[]{number.toString(), "1".repeat(Integer.parseInt(String.valueOf(number.toString().chars()
                .map(c -> c - '0')
                .reduce(0, Integer::sum))))};
    }
}
