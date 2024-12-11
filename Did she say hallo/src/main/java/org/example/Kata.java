package org.example;

public class Kata {
    public static boolean validateHello(String greetings) {

        return greetings.toLowerCase().contains("hello") ||
                greetings.toLowerCase().contains("ciao") ||
                greetings.toLowerCase().contains("salut") ||
                greetings.toLowerCase().contains("hallo") ||
                greetings.toLowerCase().contains("hola") ||
                greetings.toLowerCase().contains("ahoj") ||
                greetings.toLowerCase().contains("czesc");
    }
}
