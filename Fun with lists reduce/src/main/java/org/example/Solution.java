package org.example;

import java.util.function.BiFunction;

public class Solution {

    static <T> T reduce(Node<T> head, BiFunction<T, T, T> f, T init) {
        var current = head;
        var accumulator = init;

        while (current != null) {
            accumulator = f.apply(accumulator, current.data);
            current = current.next;
        }
        return accumulator;
    }
}
