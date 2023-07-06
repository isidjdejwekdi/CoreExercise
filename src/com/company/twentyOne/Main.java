package com.company.twentyOne;

//palindrom
public class Main {

    public static void main(String[] args) {

        String s = "А в Енисее - синева";

        System.out.println(isPalindrom(s));

    }

    public static Boolean isPalindrom(String str){
        String sTrim = str.replaceAll("[^a-zA-Z0-9а-яА-Я]", "").toLowerCase();

        System.out.println(str);

        System.out.println(sTrim);

        return sTrim.contentEquals(new StringBuilder().append(sTrim).reverse());

    }

}
