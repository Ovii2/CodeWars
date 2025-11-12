package org.example;

public class Solution {
    public static String isSortedAndHow(int[] array) {
        return isAscending(array) ? "yes, ascending"
                : isDescending(array) ? "yes, descending"
                : "no";
    }

    public static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

