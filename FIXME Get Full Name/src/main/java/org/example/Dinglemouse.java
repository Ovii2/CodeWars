package org.example;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (firstName.isEmpty()){
            return lastName;
        }
        if (lastName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }

}
