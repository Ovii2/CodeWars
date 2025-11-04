package org.example;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] nameParts = name.toUpperCase().split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }
}
