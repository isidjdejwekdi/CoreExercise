package com.company.sixteen;

public class Main {
    public static void main(String[] args) {
        printArray1(getSubArrayBetween(new int[] {1,4,6,10,15,20,21,22,25}, 5, 21));

/*        for (int el : getSubArrayBetween(new int[] {1,4,6,10,15,20,21,22,25}, 5, 20)) {
            System.out.println(el);
        }*/
    }

    public static int[] getSubArrayBetween(int[] array, int start, int end){
        int[] buf = new int[array.length];
        int i =0;
        for (int el : array) {
            if (el > start && el < end){
                buf[i] = el;
                i++;
            }
        }
        int[] result = new int[i];

        System.arraycopy(buf, 0, result, 0, i);
        return result;
    }

    public static void printArray1(int[] mas){
        System.out.print("[");
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length-1){
                System.out.print(mas[i]);
                break;
            }
            System.out.print(mas[i] + ", ");
        }
        System.out.println("]");

    }
}
