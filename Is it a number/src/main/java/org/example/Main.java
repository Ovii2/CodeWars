package org.example;

public class Main {
    static void main() {
        IO.println(MyUtilities.isDigit("3"));
        IO.println(MyUtilities.isDigit("   3   "));
        IO.println(MyUtilities.isDigit("-3.23"));
        IO.println("-".repeat(20));
        IO.println(MyUtilities.isDigit("3-4"));
        IO.println(MyUtilities.isDigit("  3   5"));
        IO.println(MyUtilities.isDigit("3 5"));
        IO.println(MyUtilities.isDigit("zero"));
    }
}
