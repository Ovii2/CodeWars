package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(CharacterCounter.validateWord("abcabc"));
        System.out.println(CharacterCounter.validateWord("Abcabc"));
        System.out.println(CharacterCounter.validateWord("AbcCBa"));
        System.out.println(CharacterCounter.validateWord("?!?!?!"));
        System.out.println(CharacterCounter.validateWord("abc123"));
        System.out.println(CharacterCounter.validateWord("abc!abc!"));
    }
}