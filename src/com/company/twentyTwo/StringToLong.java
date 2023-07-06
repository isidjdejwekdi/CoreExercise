package com.company.twentyTwo;

import java.sql.SQLOutput;

public class StringToLong {

    public static void main(String[] args) {
        System.out.println(parseAndSqrt("5"));
    }

    public static long parseAndSqrt(String number){
        return Math.round(Math.sqrt(Long.parseLong(number)));
    }

}
