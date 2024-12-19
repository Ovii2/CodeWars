package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Bud.howManyYears("1997/10/10", "2015/10/10"));
        System.out.println(Bud.howManyYears("1990/10/10", "2015/10/10"));
        System.out.println(Bud.howManyYears("2015/10/10", "1990/10/10"));
        System.out.println(Bud.howManyYears("1992/10/24", "2015/10/24"));
        System.out.println(Bud.howManyYears("2018/10/10", "2000/10/10"));
    }
}