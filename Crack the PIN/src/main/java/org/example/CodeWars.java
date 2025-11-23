package org.example;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CodeWars {
    public static String crack(String hash) {
        for (int i = 0; i <= 99999; i++) {
            if (hash.equals(hashPassword(formatToFiveDigits(i)))) {
                return formatToFiveDigits(i);
            }
        }
        return "";
    }

    public static String hashPassword(String password) {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        md5.update(StandardCharsets.UTF_8.encode(password));
        return "%032x".formatted(new BigInteger(1, md5.digest()));
    }

    public static String formatToFiveDigits(int num) {
        return "%05d".formatted(num);
    }
}
