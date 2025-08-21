package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWords {
    public static String reverseWords(String str){
        String[] words = str.split(" ");
        return IntStream.rangeClosed(1, words.length)
                .mapToObj(i -> words[words.length - i])
                .collect(Collectors.joining(" "));
    }
}
