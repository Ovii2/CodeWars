package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("abcde"));
        System.out.println(CountingDuplicates.duplicateCount("aabbcde"));
        System.out.println(CountingDuplicates.duplicateCount("aabBcde"));
        System.out.println(CountingDuplicates.duplicateCount("indivisibility"));
        System.out.println(CountingDuplicates.duplicateCount("Indivisibilities"));
        System.out.println(CountingDuplicates.duplicateCount("aA11"));
        System.out.println(CountingDuplicates.duplicateCount("ABBA"));
    }
}