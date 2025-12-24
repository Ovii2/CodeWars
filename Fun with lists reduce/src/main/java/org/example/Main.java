package org.example;

public class Main {
    static void main() {
        Node<Integer> head = new Node<>(1, new Node<>(2, new Node<>(3)));
        IO.println(Solution.reduce(head, Integer::sum, 0));
    }
}
