package com.company;

public class fifteen {

    public static void main(String[] args) {
        printArray(new int[] {1,2,2,3,44,4,5});
    }

    public static void printArray(int[] mas){
        System.out.print("[");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
            if (i == mas.length-1){
                System.out.print(mas[i]);
            }
        }
        System.out.println("]");

    }
}
