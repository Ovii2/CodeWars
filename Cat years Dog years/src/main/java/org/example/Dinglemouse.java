package org.example;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = calcAnimalYears(humanYears, 4);
        int dogYears = calcAnimalYears(humanYears, 5);
        return new int[]{humanYears, catYears, dogYears};
    }

    public static int calcAnimalYears(int humanYears, int yearsAfterTwo) {
        int age;

        switch (humanYears) {
            case 1 -> age = 15;
            case 2 -> age = 24;
            default -> age = 24 + (humanYears - 2) * yearsAfterTwo;
        }
        return age;
    }
}
