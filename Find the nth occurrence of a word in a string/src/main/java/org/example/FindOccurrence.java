package org.example;

public class FindOccurrence {
    public static int findNthOccurrence(String subStr, String str, int occurrence) {
        int count = 0;
        for (int i = 0; i <= str.length() - subStr.length(); i++) {
            if (str.startsWith(subStr, i)) {
                count++;
                if (count == occurrence){
                    return i;
                }
            }
        }
        return -1;
    }
}
