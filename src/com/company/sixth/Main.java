package com.company.sixth;

public class Main {
    public static void main(String[] args) {

//        System.out.println("\u0065\u0068");

/*        char ew = '\u0077';
        System.out.println("w " + ew);
        int a = 'w';
        char c = (char)a;*/

        char b = charExpression(2);

        float f = 2147483649f;
        int i = (int) f;
        //2147483647
        System.out.println("f "+f);
        System.out.println("i "+i);

    }

    public static char charExpression(int a){
        return (char) ('\\'+a);

    }
}
