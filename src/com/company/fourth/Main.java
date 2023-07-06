package com.company.fourth;

public class Main {
    public static void main(String[] args) {
        calcCircleRadius(10);
    }

    public static void calcCircleRadius(double area) {
        System.out.printf("radius = %.3f", Math.sqrt(area / Math.PI));
    }
}
