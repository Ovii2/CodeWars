package org.example;

public class StringInterlacing {
    public static String interlace(final String first, final String second) {
        StringBuilder result = new StringBuilder();

        String s1 = first.replaceAll("\\s", "");
        String s2 = second.replaceAll("\\s", "");

        int len1 = s1.length();
        int len2 = s2.length();

        String start;
        String other;
        if (len1 >= len2) {
            start = s1;
            other = s2;
        } else {
            start = s2;
            other = s1;
        }

        if (start.isEmpty()) {
            return other;
        }
        if (other.isEmpty()){
            return start;
        }

        int total = Math.max(len1, len2) * 2;
        int iStart = 0;
        int iOther = 0;

        for (int i = 0; i < total; i++) {
            if (i % 2 == 0) {
                result.append(start.charAt(iStart % start.length()));
                iStart++;
            } else {
                result.append(other.charAt(iOther % other.length()));
                iOther++;
            }
        }

        return result.toString();
    }
}
