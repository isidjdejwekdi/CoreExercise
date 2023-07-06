package com.company.eighteen;

public class Main {
    public static void main(String[] args) {
        printOddNumbers(new int[]{1, 2, 3, 4, 2, 6, 7});
    }

    public static void printOddNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                if (i != 0)
                    System.out.print(",");

                System.out.print(array[i]);
            }
        }
        System.out.println();
    }
}
