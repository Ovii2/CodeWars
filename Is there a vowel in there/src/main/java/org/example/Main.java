package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(VowelMapper.isVow(List.of(118, 117, 120, 121, 117, 98, 122, 97, 120, 106, 104, 116, 113, 114, 113, 120, 106)));
        System.out.println(VowelMapper.isVow(List.of(100, 100, 116, 105, 117, 121)));
    }
}