package org.example;

public class Main {
    static void main() {
        Calculator sut = new Calculator();
        IO.println(sut.getTotalArea(new Triangle(6, 4)));
        IO.println(sut.getTotalArea(new Square(6)));
        IO.println(sut.getTotalArea(new Rectangle(4, 8)));
        IO.println(sut.getTotalArea(new Circle(3)));
        IO.println(sut.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4), new Circle(1), new Circle(1), new Triangle(10, 5)));
        IO.println(sut.getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2)));
        IO.println(sut.getTotalArea());
    }
}
