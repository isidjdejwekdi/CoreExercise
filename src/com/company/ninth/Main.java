package com.company.ninth;

import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(new BigInteger("23")));
    }

    public static BigInteger factorial(BigInteger n) {

        BigInteger one = new BigInteger("1");
        return (n.compareTo(one) > 0) ? n.multiply(factorial(n.subtract(one))) : n;
    }

/*    public static int factorial (int n){

        return n > 1 ? n * factorial(n-1) : n;

    }*/
}
//fac 6 = 1 * 2 * 3 * 4 * 5 * 6
