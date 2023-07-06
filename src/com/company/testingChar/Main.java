package com.company.testingChar;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getUni('}'));
//        char b = 83;
        String greeting = "Hello";
        int n = greeting.length();
//        System.out.println(n);

        int cpCount = greeting.codePointCount(0, greeting.length());
//        System.out.println(cpCount);

        String sentence = "Z is the set of octonions";
//        String sentence = "O is the set of octonions";

        System.out.println((int) sentence.charAt(0));
        System.out.println((int) sentence.charAt(1));

        System.out.println((char)sentence.codePointAt(2));
//        char c = '\u0053';

//        System.out.println(b==c);

//        System.out.println("\u0022 + \u0022");


        // \u00A0 - знак новой строки

        System.out.println(Character.isJavaIdentifierStart('1'));


    }

    public static int getUni(char a){

        return (int) a;

    }
}
