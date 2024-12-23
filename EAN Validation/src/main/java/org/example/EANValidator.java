package org.example;

public class EANValidator {
    public static boolean validate(final String eanCode) {
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(eanCode.charAt(i));
            sum += digit * (i % 2 == 0 ? 1 : 3);
        }
        int checksum = (10 - (sum % 10)) % 10;
        return checksum == Character.getNumericValue(eanCode.charAt(12));
    }
}
