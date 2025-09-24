package org.example;

public class Main {
    static void main() {
        IO.println(AgeDiff.CalculateAge(2012, 2016));
        IO.println(AgeDiff.CalculateAge(2000, 1990));
        IO.println(AgeDiff.CalculateAge(3400, 3400));
        IO.println(AgeDiff.CalculateAge(2011, 2012));
        IO.println(AgeDiff.CalculateAge(2011, 2013));
        IO.println(AgeDiff.CalculateAge(2000, 1999));
    }
}
