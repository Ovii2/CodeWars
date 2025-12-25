package org.example;

public class BackspacesInString {
    public static String cleanString(String s) {
        return s.chars()
                .collect(StringBuilder::new, (acc, curr) -> {
                    var c = (char) curr;
                    if (c == '#') {
                        if (!acc.isEmpty()) {
                            acc.deleteCharAt(acc.length() - 1);
                        }
                    } else {
                        acc.append(c);
                    }
                }, StringBuilder::append)
                .toString();
    }
}
