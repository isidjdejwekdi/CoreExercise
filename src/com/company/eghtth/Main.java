package com.company.eghtth;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-513));
        Integer n = 34;

        /*        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.highestOneBit(n));
        System.out.println(Integer.lowestOneBit(n));*/

        String s ="";

        if (s instanceof String){
            System.out.println(s.getClass() == s.getClass());
        }



    }
    public static boolean isPowerOfTwo(int num) {

        return Math.abs(num) == Integer.highestOneBit(Math.abs(num));
    }
}