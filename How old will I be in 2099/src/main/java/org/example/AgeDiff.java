package org.example;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int currentAge = yearTo - birth;
        int futureAge = birth - yearTo;
        return birth == yearTo ? "You were born this very year!"
                : yearTo < birth ? String.format("You will be born in %d year%s.", futureAge, futureAge > 1 ? "s" : "")
                : String.format("You are %d year%s old.", currentAge, currentAge > 1 ? "s" : "");
    }
}
