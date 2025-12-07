package org.example;

public class LuckyTicket {
    public static int numberOfTickets(int from, int to) {
        int count = 0;
        for (int i = from; i <= to; i++) {
            int part1 = i / 1000;
            int part2 = i % 1000;
            if (sumDigits(part1) == sumDigits(part2)) {
                count++;
            }
        }
        return count;
    }

    public static int sumDigits(int number) {
        return String.valueOf(number)
                .chars()
                .map(c -> c - '0')
                .sum();
    }
}
