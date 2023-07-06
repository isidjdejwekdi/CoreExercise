package com.company.third;

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleExpression(1,2,3.00001));
        int a =-6;
        System.out.println(Math.abs(a));
    }

    public static boolean doubleExpression(double a, double b, double c) {
//        return a + b <= c + 0.0001 && a + b >= c - 0.0001;
        return Math.abs(a+b-c) < 0.0001;
    }
}
