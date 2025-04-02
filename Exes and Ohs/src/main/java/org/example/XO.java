package org.example;

public class XO {
    public static boolean getXO(String str) {
        int xCount = 0;
        int oCount = 0;

        for (char x : str.toCharArray()) {
            if (x == 'x' || x == 'X') {
                xCount++;
            }
        }

        for (char o : str.toCharArray()) {
            if (o == 'o' || o == 'O') {
                oCount++;
            }
        }
        return xCount == oCount;
//        return str.toLowerCase().replace("o", "").length() == str.toLowerCase().replace("x", "").length();
    }
}
