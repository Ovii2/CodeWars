package org.example;

public class FizzBuzz {
    public static int[] solution(int number) {
        int count3Not5 = 0;
        int countf5Not3 = 0;
        int count3And5 = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count3And5++;
            } else if (i % 3 == 0) {
                count3Not5++;
            } else if (i % 5 == 0) {
                countf5Not3++;
            }
        }
        return new int[]{count3Not5, countf5Not3, count3And5};
    }
}