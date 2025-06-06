package org.example;

public class Kata {
    public static String getIssuer(String cardNumber) {
        return checkCardType(cardNumber, cardNumber.length());
    }

    public static String checkCardType(String cardNumber, int length) {
        if ((cardNumber.startsWith("34") || cardNumber.startsWith("37")) && length == 15) {
            return "AMEX";
        } else if (cardNumber.startsWith("6011") && length == 16) {
            return "Discover";
        } else if ((cardNumber.startsWith("51") || cardNumber.startsWith("52") ||
                cardNumber.startsWith("53") || cardNumber.startsWith("54") ||
                cardNumber.startsWith("55")) && length == 16) {
            return "Mastercard";
        } else if (cardNumber.startsWith("4") && (length == 13 || length == 16)) {
            return "VISA";
        } else {
            return "Unknown";
        }
    }
}
