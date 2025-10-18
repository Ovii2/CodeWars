package org.example;

public class Main {
    static void main() {
        IO.println(Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
        IO.println(Sleigh.authenticate("Santa", "Ho Ho Ho!"));
        IO.println(Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
    }
}
