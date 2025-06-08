package org.example;

import java.util.ArrayList;
import java.util.List;

public class VowelMapper {
    public static List<Object> isVow(List<Integer> a) {
        List<Object> result = new ArrayList<>(a);

        result.replaceAll(i -> {
            char c = (char) (int) i;
            return "aeiou".indexOf(c) >= 0 ? String.valueOf(c) : i;
        });

        return result;
    }
}
