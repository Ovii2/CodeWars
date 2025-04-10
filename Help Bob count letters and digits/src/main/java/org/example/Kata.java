package org.example;

public class Kata {
    public static int countLettersAndDigits(String input) {

        return (int) input.chars()
                .map(c -> (char) c)
                .filter(Character::isLetterOrDigit)
                .count();
    }
}
