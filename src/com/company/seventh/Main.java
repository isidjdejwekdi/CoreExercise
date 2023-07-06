package com.company.seventh;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        byte x = 98;

        byte y = 100;

        System.out.println(getAgeDiff(y,x));
        var g = new AtomicInteger();

    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) (age1 > age2 ? age1 - age2 : age2 - age1);
    }
}
