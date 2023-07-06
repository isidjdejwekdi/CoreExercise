package com.company.second;

public class Main {
    public static void main(String[] args) {
        System.out.println(priceCalculation(87.5, 2));
    }

    public static double priceCalculation(double price, int count){
        return price * count;
    }
}
