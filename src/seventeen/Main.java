package seventeen;

public class Main {
    public static void main(String[] args) {
        printArray1(getArrayMiddle(new int[]{1, 44, 45, 6, 9, 7, 8, 9}));
    }

    public static int[] getArrayMiddle(int[] array) {

        int[] result;

        if (array.length % 2 == 0){
            result = new int[2];
            result[0] = array[array.length/2-1];
            result[1] = array[array.length/2];
        } else {
            result = new int[1];
            result[0] = array[array.length/2];
        }

        return result;
    }

    public static void printArray1(int[] mas) {
        System.out.print("[");
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1) {
                System.out.print(mas[i]);
                break;
            }
            System.out.print(mas[i] + ", ");
        }
        System.out.println("]");

    }

}
