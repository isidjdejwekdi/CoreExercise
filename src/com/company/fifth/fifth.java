package com.company.fifth;

import java.math.BigInteger;

public class fifth {
    public static void main(String[] args) {

/*        BigInteger a1 = BigInteger.valueOf(456123);
        BigInteger b1 = a1;

        a1 = BigInteger.valueOf(123);

        System.out.println(a1);
        System.out.println(b1);*/

        maxLongSqr();

    }

    public static void maxLongSqr(){
        System.out.println(BigInteger.valueOf(Long.MAX_VALUE).pow(2));
    }
}

class MyClass{

    private int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public MyClass(int a){
        this.a = a;
    }
}
